package edu.illinois.vendingmachine.action_strategy.DisposeDrink;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * VendingMachineTwo DisposeDrink2 action responsible for disposing selected drink.
 */
public class DisposeDrink2 extends DisposeDrink {
    public DisposeDrink2(DataStore data) {
        super(data);
    }

    /**
     * Dispose selected drink specific to VendingMachineTwo.
     * @param d holds selected drink.
     */
    @Override
    public void disposeDrink(int d) {
        if (d == 2) {
            System.out.print("Enjoy your coffee/");
        }
    }
}
