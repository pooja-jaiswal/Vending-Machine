package edu.illinois.vendingmachine.OutputProcessor;


import edu.illinois.vendingmachine.action_strategy.AdditivesMenu.AdditivesMenu;
import edu.illinois.vendingmachine.action_strategy.DisposeAdditives.DisposeAdditives;
import edu.illinois.vendingmachine.action_strategy.DisposeDrink.DisposeDrink;
import edu.illinois.vendingmachine.action_strategy.IncreaseCF.IncreaseCF;
import edu.illinois.vendingmachine.action_strategy.ReturnCoins.ReturnCoins;
import edu.illinois.vendingmachine.action_strategy.StorePrice.StorePrice;
import edu.illinois.vendingmachine.action_strategy.ZeroCF.ZeroCF;
import edu.illinois.vendingmachine.factory.AbstractFactory;

/**
 * This class is the general output processor for the vending machine system.
 * It must be initialized with the proper action implementations for the specific
 * vending machine that is desired. This is done thorough the Abstract Factory design pattern.
 * <p>
 * Each meta-action in this class calls the platform specific implementation of the action
 * <p>
 * This class acts as the "Client" class in the strategy design pattern
 */
public class OutputProcessor {
    /**
     * Reference to StorePrice object
     */
    StorePrice storePrice;
    /**
     * Reference to ReturnCoins object
     */
    ReturnCoins returnCoins;
    /**
     * Reference to IncreaseCF object
     */
    IncreaseCF increaseCF;
    /**
     * Reference to ZeroCF object
     */
    ZeroCF zeroCF;
    /**
     * Reference to DisposeDrink object
     */
    DisposeDrink disposeDrink;
    /**
     * Reference to DisposeAdditives object
     */
    DisposeAdditives disposeAdditives;
    /**
     * Reference to AdditivesMenu object
     */
    AdditivesMenu additivesMenu;

    public OutputProcessor(AbstractFactory af) {
        this.storePrice = af.getStorePrice();
        this.returnCoins = af.getReturnCoins();
        this.increaseCF = af.getIncreaseCF();
        this.zeroCF = af.getZeroCF();
        this.disposeDrink = af.getDisposeDrink();
        this.disposeAdditives = af.getDisposeAdditives();
        this.additivesMenu = af.getAdditivesMenu();

    }

    /**
     * This creates StorePrice object by using AbstractFactory class and It executes the storePrice() method of StorePrice class.
     */
    public void StorePrice() {
        this.storePrice.storePrice();
    }

    /**
     * This creates ReturnCoins object by using AbstractFactory class and It executes the returnCoins() method of ReturnCoins class.
     */
    public void ReturnCoins() {
        this.returnCoins.returnCoins();
    }

    /**
     * This creates IncreaseCF object by using AbstractFactory class and It executes the increaseCF() method of IncreaseCF class.
     */
    public void IncreaseCF() {
        this.increaseCF.increaseCF();
    }

    /**
     * This creates ZeroCF object by using AbstractFactory class and It executes the zeroCF() method of IncreaseCF class.
     */
    public void ZeroCF() {
        this.zeroCF.zeroCF();
    }

    /**
     * This creates DisposeDrink object by using AbstractFactory class and It executes the disposeDrink() method of DisposeDrink class.
     * @param d selected drink.
     */
    public void DisposeDrink(int d) {
        this.disposeDrink.disposeDrink(d);
    }

    /**
     * This creates DisposeAdditives object by using AbstractFactory class and It executes the disposeAdditives() method of DisposeAdditives class.
     * @param a selected additives.
     */
    public void DisposeAdditives(int a[]) {
        this.disposeAdditives.disposeAdditives(a);
    }

    /**
     * This creates AdditivesMenu object by using AbstractFactory class and It executes the additivesMenu() method of AdditivesMenu class.
     */
    public void AdditivesMenu() {
        this.additivesMenu.additivesMenu();
    }
}
