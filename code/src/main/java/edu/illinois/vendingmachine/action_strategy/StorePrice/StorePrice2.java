package edu.illinois.vendingmachine.action_strategy.StorePrice;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * VendingMachineTwo StorePrice2 action responsible for storing price.
 */
public class StorePrice2 extends StorePrice {
    public StorePrice2(DataStore data) {
        super(data);
    }

    /**
     * Stores price in data store specific to VendingMachineTwo.
     */
    @Override
    public void storePrice() {
        DataStore2 d = (DataStore2) data;
        d.setPrice(d.getTemp_p());
        System.out.println("Drink Price is set to " + d.getPrice());
    }
}
