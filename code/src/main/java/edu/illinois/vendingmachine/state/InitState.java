package edu.illinois.vendingmachine.state;

/**
 * Initial State in the EFSM model
 */
public class InitState extends State {

    InitState(StateMachine model) {
        super(model);
    }

    /**
     * Transition to State S0 and call the StoreData() meta-action
     */
    @Override
    void create() {
        if (model.s == model.LS[3]) {
            model.s = model.LS[0];
            model.getOP().StorePrice();
        }
    }
}