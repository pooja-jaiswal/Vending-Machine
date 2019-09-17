package edu.illinois.vendingmachine.machines;

import edu.illinois.vendingmachine.factory.AbstractFactory;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * This class is the InputProcessor for VendingMachineTwo and platform dependent
 */
public class VendingMachineTwo extends VendingMachine {

    public VendingMachineTwo(AbstractFactory af) {
        super(af);
    }

    /**
     * Prints operations allowed in VendingMachineTwo.
     */
    public void printOperations() {
        System.out.println(
                "\nSelect operation:" +
                        "(0) CREATE " +
                        "(1) insertcups " +
                        "(2) COIN " +
                        "(3) SUGAR " +
                        "(4) CREAM " +
                        "(5) COFFEE " +
                        "(6) Cancel " +
                        "(7) setPrice " +
                        "(q) quit"
        );
    }

    /**
     * Check the input parameters for correctness, and call the
     * CREATE() meta-event of the EFSM model
     * If input is incorrect, print a message indicating as such
     *
     * @param p Initial price of a drink.
     */
    public void CREATE(float p) {
        if (p > 0) {
            DataStore2 d = (DataStore2) this.data;
            d.setTemp_p(p);
            model.create();
        } else {
            System.out.println("Creation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    /**
     * Calls the COIN() meta-event of the EFSM model, if the COIN value is equal or more than the price of drink.
     * If input COIN value is  zero or less the the price of drink , print a message indicating as such.
     *
     * @param v : Coin value
     */
    public void COIN(float v) {
        if (v > 0) {
            DataStore2 d = (DataStore2) this.data;
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
            System.out.println("COIN value should be greater than 0$");
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
     * Calls the additive() meta-event of the EFSM model, passing the Indicator(a) value as SUGAR.
     * a: a=0 SUGAR
     */
    public void SUGAR() {
        model.additive(0);
    }

    /**
     * Calls the additive() meta-event of the EFSM model, passing the Indicator(a) value as CREAM.
     * a: a=2 CREAM
     */
    public void CREAM() {
        model.additive(2);
    }

    /**
     * Calls the disposeDrink() meta-event of the EFSM model, passing the Indicator(d) value as COFFEE.
     * d: d=2 COFFEE
     */
    public void COFFEE() {
        model.disposeDrink(2);
    }

    /**
     * Calls the CANCEL() meta-event of the EFSM model
     */
    public void CANCEL() {
        model.cancel();
    }

    /**
     * Check the input parameters for correctness, and call the
     * setPrice() meta-event of the EFSM model
     * If input is incorrect, print a message indicating as such
     *
     * @param p New price of the drink.
     */
    public void setPrice(float p) {
        if (p > 0) {
            DataStore2 d = (DataStore2) this.data;
            d.setTemp_p(p);
            model.setPrice();
        } else {
            System.out.println("Price not updated");
            System.out.println("Prices must be greater than $0");
        }
    }

}
