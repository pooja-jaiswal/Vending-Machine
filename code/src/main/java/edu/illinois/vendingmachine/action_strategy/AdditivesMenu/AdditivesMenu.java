package edu.illinois.vendingmachine.action_strategy.AdditivesMenu;


import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * Abstract AdditivesMenu action strategy
 * Groups all "Additives Menu" actions under one abstract superclass
 */
public abstract class AdditivesMenu {

    /**
     * Reference to DataStore object.
     */
    DataStore data;

    /**
     * @param data DataStore.
     */
    public AdditivesMenu(DataStore data) {
        this.data = data;
    }

    /**
     * Abstract method to display additives menu. Subclasses have to override and display their own menus.
     */
    public abstract void additivesMenu();

}
