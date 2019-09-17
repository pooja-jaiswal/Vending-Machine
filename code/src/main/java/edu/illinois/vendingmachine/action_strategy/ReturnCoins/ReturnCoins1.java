package edu.illinois.vendingmachine.action_strategy.ReturnCoins;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore1;

/**
 * VendingMachineOne ReturnCoins1 action responsible for returning coins.
 */
public class ReturnCoins1 extends ReturnCoins {
    public ReturnCoins1(DataStore data) {
        super(data);
    }

    /**
     * Returns coins from data store specific to VendingMachineOne.
     */
    @Override
    public void returnCoins() {
        DataStore1 d = (DataStore1) data;
        System.out.println("returning coins of value " + d.getCf());
    }
}
