package edu.illinois.vendingmachine.platformdata;

/**
 * DataStore2 data storage object responsible for storing key platform-specific data for VendingMachineOne that must be shared between
 * system components
 */
public class DataStore2 extends DataStore {

    private float temp_p;
    private float temp_v;
    private float price;
    private float cf;

    /**
     * This method is used to get the temporary price of drink.
     *
     * @return Temporary price
     */
    public float getTemp_p() {
        return temp_p;
    }

    /**
     * This method is used to set the temporary price of drink.
     *
     * @param temp_p Temporary price
     */
    public void setTemp_p(float temp_p) {
        this.temp_p = temp_p;
    }

    /**
     * This method is used to get the temporary coin value.
     *
     * @return Temporary coin value.
     */
    public float getTemp_v() {
        return temp_v;
    }

    /**
     * This method is used to set the temporary coin value.
     *
     * @param temp_v Temporary coin value
     */
    public void setTemp_v(float temp_v) {
        this.temp_v = temp_v;
    }

    /**
     * This method is used to get the price of a drink.
     *
     * @return Price of the drink.
     */
    public float getPrice() {
        return price;
    }

    /**
     * This method is used to set the price of a drink.
     *
     * @param price Price of drink.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * This method is used to get the value of coins inserted.
     *
     * @return Total value of coins inserted.
     */
    public float getCf() {
        return cf;
    }

    /**
     * This method is used to set the value of coins inserted.
     *
     * @param cf Total value of coins inserted.
     */
    public void setCf(float cf) {
        this.cf = cf;
    }
}
