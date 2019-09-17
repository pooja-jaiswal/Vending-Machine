package edu.illinois.vendingmachine.factory;

import edu.illinois.vendingmachine.action_strategy.AdditivesMenu.AdditivesMenu;
import edu.illinois.vendingmachine.action_strategy.AdditivesMenu.AdditivesMenu2;
import edu.illinois.vendingmachine.action_strategy.DisposeAdditives.DisposeAdditives;
import edu.illinois.vendingmachine.action_strategy.DisposeAdditives.DisposeAdditives2;
import edu.illinois.vendingmachine.action_strategy.DisposeDrink.DisposeDrink;
import edu.illinois.vendingmachine.action_strategy.DisposeDrink.DisposeDrink2;
import edu.illinois.vendingmachine.action_strategy.IncreaseCF.IncreaseCF;
import edu.illinois.vendingmachine.action_strategy.IncreaseCF.IncreaseCF2;
import edu.illinois.vendingmachine.action_strategy.ReturnCoins.ReturnCoins;
import edu.illinois.vendingmachine.action_strategy.ReturnCoins.ReturnCoins2;
import edu.illinois.vendingmachine.action_strategy.StorePrice.StorePrice;
import edu.illinois.vendingmachine.action_strategy.StorePrice.StorePrice2;
import edu.illinois.vendingmachine.action_strategy.ZeroCF.ZeroCF;
import edu.illinois.vendingmachine.action_strategy.ZeroCF.ZeroCF2;
import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.platformdata.DataStore2;

/**
 * This class is the factory that produces the necessary driver objects for VendingMachineTwo
 * Instantiates the proper action strategies with the shared data structure
 * OutputProcessor object will be instantiated with an object of this class when it needs to
 * display output for VendingMachineTwo. Output processor will call the methods provided by this class in order to bind
 * VendingMachineTwo specific actions.
 */
public class ConcreteFactory2 extends AbstractFactory {

    private DataStore data;

    /**
     * Creates concrete data store  for VendingMachineTwo whose reference is to be passed to all action classes that need it.
     */
    public ConcreteFactory2() {
        this.data = new DataStore2();
    }

    /**
     * This method returns DataStore object specific to VendingMachineTwo.
     *
     * @return DataStore
     */
    @Override
    public DataStore getDataObj() {
        return this.data;
    }

    /**
     * This method creates and returns StorePrice object specific to VendingMachineTwo.
     *
     * @return StorePrice
     */
    @Override
    public StorePrice getStorePrice() {
        return new StorePrice2(this.data);
    }

    /**
     * This method creates and returns ReturnCoins object specific to VendingMachineTwo.
     *
     * @return ReturnCoins
     */
    @Override
    public ReturnCoins getReturnCoins() {
        return new ReturnCoins2(this.data);
    }

    /**
     * This method creates and returns IncreaseCF object specific to VendingMachineTwo.
     *
     * @return IncreaseCF
     */
    @Override
    public IncreaseCF getIncreaseCF() {
        return new IncreaseCF2(this.data);
    }

    /**
     * This method creates and returns ZeroCF object specific to VendingMachineTwo.
     *
     * @return ZeroCF
     */
    @Override
    public ZeroCF getZeroCF() {
        return new ZeroCF2(this.data);
    }

    /**
     * This method creates and returns DisposeDrink object specific to VendingMachineTwo.
     *
     * @return DisposeDrink
     */
    @Override
    public DisposeDrink getDisposeDrink() {
        return new DisposeDrink2(this.data);
    }

    /**
     * This method creates and returns DisposeAdditives object specific to VendingMachineTwo.
     *
     * @return DisposeAdditives
     */
    @Override
    public DisposeAdditives getDisposeAdditives() {
        return new DisposeAdditives2(this.data);
    }

    /**
     * This method creates and returns AdditivesMenu object specific to VendingMachineTwo.
     *
     * @return AdditivesMenu
     */
    @Override
    public AdditivesMenu getAdditivesMenu() {
        return new AdditivesMenu2(this.data);
    }
}
