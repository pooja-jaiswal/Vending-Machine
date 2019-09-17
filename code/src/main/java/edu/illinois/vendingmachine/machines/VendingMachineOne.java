package edu.illinois.vendingmachine.machines;

import edu.illinois.vendingmachine.factory.AbstractFactory;
import edu.illinois.vendingmachine.platformdata.DataStore1;

/**
 * This class is the InputProcessor for VendingMachineOne and platform dependent
 */
public class VendingMachineOne extends VendingMachine {

    public VendingMachineOne(AbstractFactory af) {
        super(af);
    }

    /**
     * Prints operations allowed in VendingMachineOne.
     */
    public void printOperations() {
        System.out.println(
                "\nSelect operation:" +
                        "(0) create " +
                        "(1) insertCups " +
                        "(2) coin " +
                        "(3) card " +
                        "(4) sugar " +
                        "(5) chocolate " +
                        "(6) tea " +
                        "(7) Cancel " +
                        "(8) setPrice " +
                        "(q) quit"
        );
    }

    /**
     * Check the input parameters for correctness, and call the
     * create() meta-event of the EFSM model
     * If input is incorrect, print a message indicating as such
     *
     * @param p Initial price of a drink.
     */
    public void create(int p) {
        if (p > 0) {
            DataStore1 d = (DataStore1) this.data;
            d.setTemp_p(p);
            model.create();
        } else {
            System.out.println("Creation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    /**
     * Calls the coin() meta-event of the EFSM model, if the coin value is equal or more than the price of drink.
     * If input coin value is  zero or less the the price of drink , print a message indicating as such.
     *
     * @param v : Coin value
     */
    public void coin(int v) {
        if (v > 0) {
            DataStore1 d = (DataStore1) this.data;
            d.setTemp_v(v);
            if (d.getCf() + v < d.getPrice()) {
                model.coin(0);
                if (model.k > 0) {
                    System.out.println("Please insert " + (d.getPrice() - d.getCf()) + "$ more");
                }
            } else {
                model.coin(1);
            }
        } else {
            System.out.println("coin value should be greater than 0$");
        }
    }

    /**
     * Calls the insertCups() meta-event of the EFSM model.
     *
     * @param n: Number of cups being inserted
     */
    public void insertCups(int n) {
        model.insertCups(n);
    }

    /**
     * Check the available fund in card, and call the card() meta-event of the EFSM model
     * If fund is not available in card , print a message indicating as such
     *
     * @param x: Available amount in the card.
     */
    public void card(float x) {
        DataStore1 d = (DataStore1) this.data;
        if (x > 0) {
            if (x >= d.getPrice()) {
                model.card();
            } else {
                if (model.k > 0) {
                    System.out.println("Please add " + (d.getPrice() - x) + "$ more in card");
                }
            }
        }
    }

    /**
     * Calls the disposeDrink() meta-event of the EFSM model, passing the Indicator(d) value as tea.
     * d: d=1 tea
     */
    public void tea() {
        model.disposeDrink(1);
    }

    /**
     * Calls the additive() meta-event of the EFSM model, passing the Indicator(a) value as sugar.
     * a: a=0 sugar
     */
    public void sugar() {
        model.additive(0);
    }

    /**
     * Calls the additive() meta-event of the EFSM model, passing the Indicator(a) value as chocolate.
     * a: a=1 chocolate
     */
    public void chocolate() {
        model.additive(1);
    }

    /**
     * Calls the cancel() meta-event of the EFSM model
     */
    public void cancel() {
        model.cancel();
    }

    /**
     * Check the input parameters for correctness, and call the
     * setPrice() meta-event of the EFSM model
     * If input is incorrect, print a message indicating as such
     *
     * @param p New price of the drink.
     */
    public void setPrice(int p) {
        if (p > 0) {
            DataStore1 d = (DataStore1) this.data;
            d.setTemp_p(p);
            model.setPrice();
        } else {
            System.out.println("Price not updated");
            System.out.println("Prices must be greater than $0");
        }
    }
}
