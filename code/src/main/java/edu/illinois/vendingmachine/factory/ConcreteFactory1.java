package edu.illinois.vendingmachine.factory;

import edu.illinois.vendingmachine.action_strategy.AdditivesMenu.AdditivesMenu;
import edu.illinois.vendingmachine.action_strategy.AdditivesMenu.AdditivesMenu1;
import edu.illinois.vendingmachine.action_strategy.DisposeAdditives.DisposeAdditives;
import edu.illinois.vendingmachine.action_strategy.DisposeAdditives.DisposeAdditives1;
import edu.illinois.vendingmachine.action_strategy.DisposeDrink.DisposeDrink;
import edu.illinois.vendingmachine.action_strategy.DisposeDrink.DisposeDrink1;
import edu.illinois.vendingmachine.action_strategy.IncreaseCF.IncreaseCF;
import edu.illinois.vendingmachine.action_strategy.IncreaseCF.IncreaseCF1;
import edu.illinois.vendingmachine.action_strategy.ReturnCoins.ReturnCoins;
import edu.illinois.vendingmachine.action_strategy.ReturnCoins.ReturnCoins1;
import edu.illinois.vendingmachine.action_strategy.StorePrice.StorePrice;
import edu.illinois.vendingmachine.action_strategy.StorePrice.StorePrice1;
import edu.illinois.vendingmachine.action_strategy.ZeroCF.ZeroCF;
import edu.illinois.vendingmachine.action_strategy.ZeroCF.ZeroCF1;
import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore1;

/**
 * This class is the factory that produces the necessary driver objects for VendingMachineOne
 * Instantiates the proper action strategies with the shared data structure
 * OutputProcessor object will be instantiated with an object of this class when it needs to
 * display output for VendingMachineOne. Output processor will call the methods provided by this class in order to bind
 * VendingMachineOne specific actions.
 */
public class ConcreteFactory1 extends AbstractFactory {

    private DataStore data;

    /**
     * Creates concrete data store  for VendingMachineOne whose reference is to be passed to all action classes that need it.
     */
    public ConcreteFactory1() {
        this.data = new DataStore1();
    }

    /**
     * This method returns DataStore object specific to VendingMachineOne.
     *
     * @return DataStore
     */
    @Override
    public DataStore getDataObj() {
        return this.data;
    }

    /**
     * This method creates and returns StorePrice object specific to VendingMachineOne.
     *
     * @return StorePrice
     */
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice1(this.data);
    }

    /**
     * This method creates and returns ReturnCoins object specific to VendingMachineOne.
     *
     * @return ReturnCoins
     */
    @Override
    public ReturnCoins getReturnCoins() {
        return new ReturnCoins1(this.data);
    }

    /**
     * This method creates and returns IncreaseCF object specific to VendingMachineOne.
     *
     * @return IncreaseCF
     */
    @Override
    public IncreaseCF getIncreaseCF() {
        return new IncreaseCF1(this.data);
    }

    /**
     * This method creates and returns ZeroCF object specific to VendingMachineOne.
     *
     * @return ZeroCF
     */
    @Override
    public ZeroCF getZeroCF() {
        return new ZeroCF1(this.data);
    }

    /**
     * This method creates and returns DisposeDrink object specific to VendingMachineOne.
     *
     * @return DisposeDrink
     */
    @Override
    public DisposeDrink getDisposeDrink() {
        return new DisposeDrink1(this.data);
    }

    /**
     * This method creates and returns DisposeAdditives object specific to VendingMachineOne.
     *
     * @return DisposeAdditives
     */
    @Override
    public DisposeAdditives getDisposeAdditives() {
        return new DisposeAdditives1(this.data);
    }

    /**
     * This method creates and returns AdditivesMenu object specific to VendingMachineOne.
     *
     * @return AdditivesMenu
     */
    @Override
    public AdditivesMenu getAdditivesMenu() {
        return new AdditivesMenu1(this.data);
    }


}
