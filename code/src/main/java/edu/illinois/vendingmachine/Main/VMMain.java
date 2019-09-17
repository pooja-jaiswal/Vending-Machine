package edu.illinois.vendingmachine.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.illinois.vendingmachine.factory.ConcreteFactory1;
import edu.illinois.vendingmachine.factory.ConcreteFactory2;
import edu.illinois.vendingmachine.machines.VendingMachineOne;
import edu.illinois.vendingmachine.machines.VendingMachineTwo;

/**
 * This class is a driver class to run the Vending Machines
 */
public class VMMain {

    /**
     *
     * @param args
     * This is the main method where execution starts.
     */
    public static void main(String[] args) {
        System.out.println("Select any Vending Machine");
        System.out.println("1. Vending Machine1");
        System.out.println("2. Vending Machine2");

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        try {
            int ch = Integer.parseInt(scan.readLine());

            String input = "initial";
            switch (ch) {
                case 1:
                    ConcreteFactory1 cf1 = new ConcreteFactory1();
                    VendingMachineOne vm1 = new VendingMachineOne(cf1);
                    System.out.println(
                            "Vending Machine1 " +
                                    "\nMENU of Operations: " +
                                    "\n-------------------------" +
                                    "\n(0) create" +
                                    "\n(1) insertCups " +
                                    "\n(2) coin " +
                                    "\n(3) card " +
                                    "\n(4) sugar " +
                                    "\n(5) chocolate " +
                                    "\n(6) tea" +
                                    "\n(7) Cancel " +
                                    "\n(8) setPrice " +
                                    "\n(q) quit" +
                                    "\n-------------------------"
                    );
                    while (!input.equals("q")) {
                        vm1.printOperations();
                        input = scan.readLine();

                        switch (input) {
                            case "0":  // create
                                System.out.println(">create<");
                                System.out.println("Enter initial price of drink:");
                                try {
                                    int p = Integer.parseInt(scan.readLine());
                                    vm1.create(p);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a integer.");
                                }
                                break;
                            case "1":
                                System.out.println(">insert cups<");
                                System.out.println("Please insert the cups");
                                try {
                                    int n = Integer.parseInt(scan.readLine());
                                    vm1.insertCups(n);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. coin value should not be decimal.");
                                }
                                break;
                            case "2":
                                System.out.println(">coin<");
                                int v;
                                System.out.println("Please insert the coin");
                                try {
                                    v = Integer.parseInt(scan.readLine());
                                    vm1.coin(v);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. coin value should not be decimal.");
                                }
                                break;

                            case "3":
                                System.out.println(">card<");
                                System.out.println("Please add money in the card");
                                float x = Float.parseFloat(scan.readLine());
                                vm1.card(x);
                                break;
                            case "4":
                                System.out.println(">sugar<");
                                System.out.println("sugar is selected");
                                vm1.sugar();
                                break;
                            case "5":
                                System.out.println(">chocolate<");
                                System.out.println("chocolate is selected");
                                vm1.chocolate();
                                break;
                            case "6":
                                System.out.println(">tea<");
                                System.out.println("tea selected");
                                vm1.tea();
                                break;
                            case "7":
                                System.out.println(">CANCEL<");
                                vm1.cancel();
                                break;
                            case "8":
                                System.out.println(">setPrice<");
                                System.out.println("Enter updated drink price:");
                                try {
                                    int p = Integer.parseInt(scan.readLine());
                                    vm1.setPrice(p);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a integer.");
                                }
                                break;
                            default:
                                break;

                        }
                    }
                    break;

                case 2:
                    System.out.println("Vending Machine2");
                    ConcreteFactory2 cf2= new ConcreteFactory2();
                    VendingMachineTwo vm2 = new VendingMachineTwo(cf2);
                    System.out.println(
                            "Vending Machine2 " +
                                    "\nMENU of Operations: " +
                                    "\n-------------------------" +
                                    "\n(0) CREATE" +
                                    "\n(1) insertCups " +
                                    "\n(2) COIN " +
                                    "\n(3) SUGAR " +
                                    "\n(4) CREAM " +
                                    "\n(5) COFFEE" +
                                    "\n(6) CANCEL " +
                                    "\n(7) setPrice " +
                                    "\n(q) quit" +
                                    "\n-------------------------"
                    );
                    while (!input.equals("q")) {
                        vm2.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0":  // CREATE
                                System.out.println(">CREATE<");
                                System.out.println("Enter initial price of drink:");
                                try {
                                    float p = Float.parseFloat(scan.readLine());
                                    vm2.CREATE(p);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a float.");
                                }
                                break;
                            case "1":
                                System.out.println(">insert cups<");
                                System.out.println("Please insert the cups");
                                try {
                                    int n = Integer.parseInt(scan.readLine());
                                    vm2.insertCups(n);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. coin value should not be decimal.");
                                }
                                break;
                            case "2":
                                System.out.println(">COIN<");

                                System.out.println("Please insert the COIN");
                                try {
                                   float v = Float.parseFloat(scan.readLine());
                                    vm2.COIN(v);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. COIN value should not be decimal.");
                                }
                                break;
                            case "3":
                                System.out.println(">SUGAR<");
                                System.out.println("SUGAR is selected");
                                vm2.SUGAR();
                                break;
                            case "4":
                                System.out.println(">CREAM<");
                                System.out.println("CREAM is selected");
                                vm2.CREAM();
                                break;
                            case "5":
                                System.out.println(">COFFEE<");
                                System.out.println("COFFEE selected");
                                vm2.COFFEE();
                                break;
                            case "6":
                                System.out.println(">CANCEL<");
                                vm2.CANCEL();
                                break;
                            case "7":
                                System.out.println(">setPrice<");
                                System.out.println("Enter updated drink price:");
                                try {
                                    float p = Float.parseFloat(scan.readLine());
                                    vm2.setPrice(p);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be a float.");
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
