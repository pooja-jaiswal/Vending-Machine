package edu.illinois.vendingmachine.action_strategy.AdditivesMenu;

import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * VendingMachineTwo AdditivesMenu action responsible for printing the additive menu
 */
public class AdditivesMenu2 extends AdditivesMenu {


    public AdditivesMenu2(DataStore data) {
        super(data);
    }

    /**
     * Displays additives menu specific to VendingMachineTwo.
     */
    @Override
    public void additivesMenu() {
        System.out.println("Please select additive:");
        System.out.println(
                "(3) suagr " +
                        "\n(4) cream");
        System.out.println("Otherwise, select (5) plain coffee");
    }
}
