package edu.illinois.vendingmachine.state;

/**
 * This class represent No Cups state in State Diagram.
 */
public class S0 extends State {

    public S0(StateMachine model) {
        super(model);
    }

    /**
     * This method returns coins if cups are not available.
     * @param f : coin value
     */
    @Override
    public void coin(int f) {
        if(model.s == model.LS[0] ){
            if(model.k ==0){
                System.out.println("Cups not available.Please insert cups");
                model.getOP().IncreaseCF();
                model.getOP().ReturnCoins();
            }
        }
    }

    /**
     * This method inserts the cups, if the number of cups are inserted is 1 or more.
     * @param n: number of cups being inserted
     */
    @Override
    public void insertCups(int n){
        if(model.s == model.LS[0]){
            if(n>0) {
                model.k = n;
                model.s = model.LS[1];
                model.getOP().ZeroCF();
                System.out.println(n + " Cups are inserted. Now select payment");
            }
        }
    }
}
