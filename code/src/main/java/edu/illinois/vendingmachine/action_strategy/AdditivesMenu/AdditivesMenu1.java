package edu.illinois.vendingmachine.action_strategy.AdditivesMenu;

import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * VendingMachineOne AdditivesMenu action responsible for printing the additive menu
 */
public class AdditivesMenu1 extends AdditivesMenu {

    public AdditivesMenu1(DataStore data) {
        super(data);
    }

    /**
     * Displays additives menu specific to VendingMachineOne.
     */
    @Override
    public void additivesMenu() {
        System.out.println("Please select additive:");
        System.out.println(
                "(4) suagr " +
                        "\n(5) chocolate");
        System.out.println("Otherwise, select (6) plain drink");
    }
}
