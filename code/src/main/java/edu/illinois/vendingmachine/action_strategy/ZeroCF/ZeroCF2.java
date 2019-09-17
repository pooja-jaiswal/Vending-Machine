package edu.illinois.vendingmachine.action_strategy.ZeroCF;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * VendingMachineTwo ZeroCF2 action responsible for setting cf value to 0.
 */
public class ZeroCF2 extends ZeroCF {
    public ZeroCF2(DataStore data) {
        super(data);
    }

    /**
     * Sets cf value to 0 in data store specific to VendingMachineTwo.
     */
    @Override
    public void zeroCF() {
        DataStore2 d = (DataStore2) data;
        d.setCf(0);
    }
}
