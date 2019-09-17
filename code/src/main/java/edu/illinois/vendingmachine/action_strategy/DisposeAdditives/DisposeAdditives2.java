package edu.illinois.vendingmachine.action_strategy.DisposeAdditives;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * VendingMachineTwo DisposeAdditives2 action responsible for disposing selected additives.
 */
public class DisposeAdditives2 extends DisposeAdditives {

    public DisposeAdditives2(DataStore data) {
        super(data);
    }

    /**
     * Dispose additives specific to VendingMachineTwo.
     * @param a holds selected additives.
     */
    @Override
    public void disposeAdditives(int[] a) {
        if (a[0] == 1) {
            System.out.print("sugar/");
        }
        if (a[2] == 1) {
            System.out.print("cream");
        }
    }
}
