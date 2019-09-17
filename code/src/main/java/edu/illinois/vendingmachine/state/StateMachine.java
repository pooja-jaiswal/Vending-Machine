package edu.illinois.vendingmachine.state;


import edu.illinois.vendingmachine.OutputProcessor.OutputProcessor;

/**
 * This class is the context class in the De-centralized State design pattern
 * State classes are responsible for performing
 * 1) Actions
 * 2) State transitions
 * <p>
 * Maintain a pointer to the current state in this "context" class.
 */
public class StateMachine {

    protected State s;
    /**
     * List of states in the EFSM
     */
    protected State[] LS;
    private OutputProcessor op;

    public int k = 0;
    /**
     * 0-sugar
     * 1-chocolate
     * 2-cream
     */
    public int[] additives = new int[3];

    /**
     *Instantiate each state, passing in a reference to this VM class
     */
    public StateMachine() {

        LS = new State[4];


        LS[3] = new InitState(this);
        LS[0] = new S0(this);
        LS[1] = new S1(this);
        LS[2] = new S2(this);
        s = LS[3]; // Initially in the Init State
    }

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    public void create() {
        k = 0;
        s.create();
    }

    public void coin(int f) {
        s.coin(f);
    }

    public void insertCups(int n) {
        s.insertCups(n);
    }

    public void additive(int a) {
        s.additive(a);
    }

    public void disposeDrink(int d) {
        s.disposeDrink(d);
    }

    public void card() {
        s.card();
    }

    public void cancel() {
        s.cancel();
    }

    public void setPrice() {
        s.setPrice();
    }
}
