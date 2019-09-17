package edu.illinois.vendingmachine.state;


import java.util.Arrays;

/**
 * This class represents idle state in State Diagram.
 */
public class S1 extends State {
    public S1(StateMachine model) {
        super(model);
    }

    /**
     *This method moves state to S2 and shows Additives Menu if values of f = 1.
     * Calls AdditivesMenu action.
     * @param f : Indicator for coin value
     *          1 - Indicates coin values equals to price of drink.
     *          0- Indicates coin values less than price of drink.
     */
    @Override
    public void coin(int f) {
        if (model.s == model.LS[1]) {
            model.getOP().IncreaseCF();
            if (f == 1) {
                Arrays.fill(model.additives,0);
                model.s = model.LS[2];
                model.getOP().AdditivesMenu();
            }
        }
    }

    /**
     * This method moves state to S2 and shows Additives Menu.
     * Calls AdditivesMenu action.
     */
    @Override
    public void card(){
        if (model.s == model.LS[1]){
            model.getOP().ZeroCF();
            Arrays.fill(model.additives,0);
            model.s = model.LS[2];
            model.getOP().AdditivesMenu();
        }
    }

    /**
     *This method inserts the cups.
     * @param n : number of cups inserted
     */
    @Override
    public void insertCups(int n) {
        if (model.s == model.LS[1]) {
            if (n > 0) {
                model.k = model.k + n;
            }
        }
    }

    /**
     * This method sets the new price of the drink in idle state.
     * Calls StorePrice action.
     */
    @Override
    public void setPrice() {
        if (model.s == model.LS[1]) {
            model.getOP().StorePrice();
        }
    }


}
