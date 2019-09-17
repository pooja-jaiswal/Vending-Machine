package edu.illinois.vendingmachine.action_strategy.IncreaseCF;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * VendingMachineTwo IncreaseCF2 action responsible for increasing cf value.
 */
public class IncreaseCF2 extends IncreaseCF {
    public IncreaseCF2(DataStore data) {
        super(data);
    }

    /**
     * Increases cf value in data store specific to VendingMachineTwo.
     */
    @Override
    public void increaseCF() {
        DataStore2 d = (DataStore2) data;
        d.setCf(d.getCf() + d.getTemp_v());
    }
}
