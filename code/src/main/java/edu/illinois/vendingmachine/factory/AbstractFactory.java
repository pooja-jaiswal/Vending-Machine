package edu.illinois.vendingmachine.factory;

import edu.illinois.vendingmachine.action_strategy.AdditivesMenu.AdditivesMenu;
import edu.illinois.vendingmachine.action_strategy.DisposeAdditives.DisposeAdditives;
import edu.illinois.vendingmachine.action_strategy.DisposeDrink.DisposeDrink;
import edu.illinois.vendingmachine.action_strategy.IncreaseCF.IncreaseCF;
import edu.illinois.vendingmachine.action_strategy.ReturnCoins.ReturnCoins;
import edu.illinois.vendingmachine.action_strategy.StorePrice.StorePrice;
import edu.illinois.vendingmachine.action_strategy.ZeroCF.ZeroCF;
import edu.illinois.vendingmachine.platformdata.DataStore;

/**
 * This class groups all ConcreteFactory classes under one abstract superclass.
 * It defines the methods that return the VendingMachine specific action components which
 * all ConcreteFactories need to implement.
 */
public abstract class AbstractFactory {
    /**
     * Abstract method returns DataStore object. Subclasses have to implement to return DataStore specific to them.
     *
     * @return DataStore
     */
    public abstract DataStore getDataObj();

    /**
     * Abstract method returns StorePrice object. Subclasses have to implement to return StorePrice object specific to them.
     *
     * @return DataStore
     */
    public abstract StorePrice getStorePrice();

    /**
     * Abstract method returns ReturnCoins object. Subclasses have to implement to return ReturnCoins object specific to them.
     *
     * @return ReturnCoins
     */
    public abstract ReturnCoins getReturnCoins();

    /**
     * Abstract method returns IncreaseCF object. Subclasses have to implement to return IncreaseCF object specific to them.
     *
     * @return IncreaseCF
     */
    public abstract IncreaseCF getIncreaseCF();

    /**
     * Abstract method returns ZeroCF object. Subclasses have to implement to return ZeroCF object specific to them.
     *
     * @return ZeroCF
     */
    public abstract ZeroCF getZeroCF();

    /**
     * Abstract method returns DisposeDrink object. Subclasses have to implement to return DisposeDrink object specific to them.
     *
     * @return DisposeDrink
     */
    public abstract DisposeDrink getDisposeDrink();

    /**
     * Abstract method returns DisposeAdditives object. Subclasses have to implement to return DisposeAdditives object specific to them.
     *
     * @return DisposeAdditives
     */
    public abstract DisposeAdditives getDisposeAdditives();

    /**
     * Abstract method returns AdditivesMenu object. Subclasses have to implement to return AdditivesMenu object specific to them.
     *
     * @return AdditivesMenu
     */
    public abstract AdditivesMenu getAdditivesMenu();
}
