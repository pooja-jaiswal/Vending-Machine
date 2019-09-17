package edu.illinois.vendingmachine.action_strategy.ZeroCF;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore1;

/**
 * VendingMachineOne ZeroCF1 action responsible for setting cf value to 0.
 */
public class ZeroCF1 extends ZeroCF {


    public ZeroCF1(DataStore data) {
        super(data);
    }

    /**
     * Sets cf value to 0 in data store specific to VendingMachineOne.
     */
    @Override
    public void zeroCF() {
        DataStore1 d = (DataStore1) data;
        d.setCf(0);
    }
}
