package edu.illinois.vendingmachine.action_strategy.ReturnCoins;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract ReturnCoins action strategy
 * Groups all "Return Coins" actions under one abstract superclass
 */
public abstract class ReturnCoins {
    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     *
     * @param data DataStore.
     */
    public ReturnCoins(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method returns coins. Subclasses have to override this method to return coins from their respective data store object.
     */
    public abstract void returnCoins();
}
