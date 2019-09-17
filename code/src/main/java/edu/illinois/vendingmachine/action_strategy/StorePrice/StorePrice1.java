package edu.illinois.vendingmachine.action_strategy.StorePrice;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore1;

/**
 * VendingMachineOne StorePrice1 action responsible for storing price.
 */
public class StorePrice1 extends StorePrice {


    public StorePrice1(DataStore data) {
        super(data);
    }

    /**
     * Stores price in data store specific to VendingMachineOne.
     */
    @Override
    public void storePrice() {
        DataStore1 d = (DataStore1) data;
        d.setPrice(d.getTemp_p());
        System.out.println("Drink Price is set to " + d.getPrice());
    }
}
