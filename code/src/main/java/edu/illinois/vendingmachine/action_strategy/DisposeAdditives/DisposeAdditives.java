package edu.illinois.vendingmachine.action_strategy.DisposeAdditives;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract DisposeAdditives action strategy
 * Groups all "Dispose Additives" actions under one abstract superclass
 */
public abstract class DisposeAdditives {
    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     *
     * @param data DataStore.
     */
    public DisposeAdditives(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method to dispose additives.
     *
     * @param a holds selected additives.
     */
    public abstract void disposeAdditives(int[] a);

}
