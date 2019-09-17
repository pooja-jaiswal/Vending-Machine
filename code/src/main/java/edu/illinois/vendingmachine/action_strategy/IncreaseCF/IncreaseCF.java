package edu.illinois.vendingmachine.action_strategy.IncreaseCF;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract IncreaseCF action strategy
 * Groups all "Increase CF" actions under one abstract superclass
 */
public abstract class IncreaseCF {
    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     *
     * @param data DataStore.
     */
    public IncreaseCF(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method to increase cf. Subclasses have to override this method to increase cf value in their respective data store object.
     */
    public abstract void increaseCF();
}
