package edu.illinois.vendingmachine.machines;

import edu.illinois.vendingmachine.OutputProcessor.OutputProcessor;
import edu.illinois.vendingmachine.factory.AbstractFactory;
import edu.illinois.vendingmachine.platformdata.DataStore;
import edu.illinois.vendingmachine.state.StateMachine;

/**
 * This abstract superclass implements the client-side of the Abstract Factory design pattern.
 * It provides a constructor which subclasses can use to build up their drivers and necessary objects.
 * <p>
 * Each child VendingMachine class will call this superclass's constructor passing in its own ConcreteFactory
 * as the AbstractFactory field. The ConcreteFactory class makes sure each returned object has the proper
 * object references
 */
public abstract class VendingMachine {

    DataStore data;
    StateMachine model;


    VendingMachine(AbstractFactory af) {
        this.data = af.getDataObj();
        this.model = new StateMachine();
        this.model.setOP(new OutputProcessor(af));
    }

    /**
     * Each concrete VendingMachine must display a menu of its supported operations.
     */
    public abstract void printOperations();

}
