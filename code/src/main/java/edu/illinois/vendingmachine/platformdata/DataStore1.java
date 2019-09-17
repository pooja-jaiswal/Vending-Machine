package edu.illinois.vendingmachine.platformdata;

/**
 * DataStore1 data storage object responsible for storing key platform-specific data for VendingMachineOne that must be shared between
 * system components
 */
public class DataStore1 extends DataStore {
    private int temp_p;
    private int temp_v;
    private int price;
    private int cf;

    /**
     * This method is used to get the temporary price of drink.
     *
     * @return Temporary price
     */
    public int getTemp_p() {
        return temp_p;
    }

    /**
     * This method is used to set the temporary price of drink.
     *
     * @param temp_p Temporary price.
     */
    public void setTemp_p(int temp_p) {
        this.temp_p = temp_p;
    }

    /**
     * This method is used to get the temporary coin value.
     *
     * @return Temporary coin value.
     */
    public int getTemp_v() {
        return temp_v;
    }

    /**
     * This method is used to set the temporary coin value.
     *
     * @param temp_v Temporary coin value
     */
    public void setTemp_v(int temp_v) {
        this.temp_v = temp_v;
    }

    /**
     * This method is used to get the price of a drink.
     *
     * @return Price of the drink.
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method is used to set the price of a drink.
     *
     * @param price Price of drink
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * This method is used to get the value of coins inserted.
     *
     * @return Total value of coins inserted.
     */
    public int getCf() {
        return cf;
    }

    /**
     * This method is used to set the value of coins inserted.
     *
     * @param cf Total value of coins inserted.
     */
    public void setCf(int cf) {
        this.cf = cf;
    }
}
