package edu.illinois.vendingmachine.action_strategy.IncreaseCF;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore1;

/**
 * VendingMachineOne IncreaseCF1 action responsible for increasing cf value.
 */
public class IncreaseCF1 extends IncreaseCF {


    public IncreaseCF1(DataStore data) {
        super(data);
    }

    /**
     * Increases cf value in data store specific to VendingMachineOne.
     */
    @Override
    public void increaseCF() {
        DataStore1 d = (DataStore1) data;
        d.setCf(d.getCf() + d.getTemp_v());
    }
}
