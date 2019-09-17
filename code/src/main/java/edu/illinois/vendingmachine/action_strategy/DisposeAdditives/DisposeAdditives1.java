package edu.illinois.vendingmachine.action_strategy.DisposeAdditives;

import edu.illinois.vendingmachine.platformdata.DataStore;
/**
 VendingMachineOne DisposeAdditives1 action responsible for disposing selected additives.
 */
public class DisposeAdditives1 extends DisposeAdditives{


    public DisposeAdditives1(DataStore data) {
        super(data);
    }

    /**
     * Dispose additives specific to VendingMachineOne.
     * @param a holds selected additives.
     */
    @Override
    public void disposeAdditives(int[] a) {
        if(a[0] == 1){
            System.out.print("sugar/");
        }
        if(a[1] == 1){
            System.out.print("chocolate");
        }
    }
}
