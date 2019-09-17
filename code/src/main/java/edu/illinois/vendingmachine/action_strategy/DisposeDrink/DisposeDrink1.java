package edu.illinois.vendingmachine.action_strategy.DisposeDrink;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * VendingMachineOne DisposeDrink1 action responsible for disposing selected drink.
 */
public class DisposeDrink1 extends DisposeDrink {

    public DisposeDrink1(DataStore data) {
        super(data);
    }

    /**
     * Dispose selected drink specific to VendingMachineOne.
     * @param d holds selected drink.
     */
    @Override
    public void disposeDrink(int d) {
        if (d == 1) {
            System.out.print("Enjoy your tea/");
        } else if (d == 2) {
            System.out.print("Enjoy your coffee/");
        }

    }
}
