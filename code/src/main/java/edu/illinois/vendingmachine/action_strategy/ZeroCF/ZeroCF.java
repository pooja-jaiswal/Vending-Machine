package edu.illinois.vendingmachine.action_strategy.ZeroCF;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract ZeroCF action strategy
 * Groups all "Zero CF" actions under one abstract superclass
 */
public abstract class ZeroCF {
    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     *
     * @param data DataStore.
     */
    public ZeroCF(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method to set cf value to 0. Subclasses have to override this method to update cf value in their respective data store object.
     */
    public abstract void zeroCF();
}
