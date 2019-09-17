package edu.illinois.vendingmachine.action_strategy.ReturnCoins;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * VendingMachineTwo ReturnCoins2 action responsible for returning coins.
 */
public class ReturnCoins2 extends ReturnCoins {
    public ReturnCoins2(DataStore data) {
        super(data);
    }

    /**
     * Returns coins from data store specific to VendingMachineTwo.
     */
    @Override
    public void returnCoins() {
        DataStore2 d = (DataStore2) data;
        System.out.println("returning coins of value " + d.getCf());
    }
}
