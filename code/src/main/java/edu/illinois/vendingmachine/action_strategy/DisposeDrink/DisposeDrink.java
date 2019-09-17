package edu.illinois.vendingmachine.action_strategy.DisposeDrink;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract DisposeDrink action strategy
 * Groups all "Dispose Drink" actions under one abstract superclass
 */
public abstract class DisposeDrink {
    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     *
     * @param data DataStore.
     */
    public DisposeDrink(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method to dispose selected drink.
     *
     * @param d holds selected drink.
     */
    public abstract void disposeDrink(int d);
}
