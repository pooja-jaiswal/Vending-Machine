package edu.illinois.vendingmachine.action_strategy.StorePrice;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract StorePrice action strategy
 * Groups all "Store Price" actions under one abstract superclass
 */
public abstract class StorePrice {
    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     *
     * @param data DataStore.
     */
    public StorePrice(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method stores price. Subclasses have to override this method to store price in their respective data store object.
     */
    public abstract void storePrice();
}
