package edu.illinois.vendingmachine.state;

/**
 * This class represent COIN inserted state in state diagram.
 */
public class S2 extends State {
    public S2(StateMachine model) {
        super(model);
    }

    @Override
    public void disposeDrink(int d) {
        if (model.s == model.LS[2]) {
            if (model.k > 1) {
                model.s = model.LS[1];
            } else {
                model.s = model.LS[0];
            }
            model.getOP().DisposeDrink(d);
            model.getOP().DisposeAdditives(model.additives);
            model.k = model.k - 1;
            model.getOP().ZeroCF();
        }
    }

    @Override
    public void additive(int a) {
        if (model.s == model.LS[2]) {
            if (model.additives[a] == 0) {
                model.additives[a] = 1;
            } else {
                model.additives[a] = 0;
            }
        }
    }
    @Override
    public void cancel(){
        if (model.s == model.LS[2]){
            model.s = model.LS[1];
            model.getOP().ReturnCoins();
            model.getOP().ZeroCF();
        }
    }
}
