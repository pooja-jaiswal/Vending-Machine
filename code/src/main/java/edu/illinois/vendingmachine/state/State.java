package edu.illinois.vendingmachine.state;

/**
 * This class is the abstract State superclass in the De-centralized State Design Pattern
 * <p>
 * Normally, each operation defined in this class should be abstract. However, due to Java-specific
 * requirements regarding abstract classes, it was decided to instead default each operation to print
 * a "not allowed" message.
 * <p>
 * This is because if all methods in this class are declared abstract, then all abstract methods MUST be overridden
 * by EACH  sub-class, and most subclasses would only ACTUALLY implement only 1 or 2 of the methods.
 * The rest would have empty bodies and that is a waste of both coding space and memory space.
 * <p>
 * In this design,
 * methods are initially defined to print a "Not Allowed" message.
 * Each subclass inherits these methods and overrides the appropriate ones.
 * This means that methods that do not get overridden will print a "Not Allowed" message
 * if they are called from a that does not allow them to be called
 */
public abstract class State {
    StateMachine model;

    public State(StateMachine model) {
        this.model = model;
    }

    /**
     *
     */
    void create() {
        notAllowed();
    }

    void coin(int f) {
        notAllowed();
    }

    void insertCups(int n) {
        notAllowed();
    }

    /**
     * Prints not allowed message if the methods in this class are called in the in appropriate state.
     */
    private void notAllowed() {
        System.out.println("OPERATION NOT ALLOWED IN THIS STATE");
    }

    public void disposeDrink(int d) {
        notAllowed();
    }

    public void additive(int a) {
        notAllowed();
    }

    void card() {
        notAllowed();
    }

    public void cancel() {
        notAllowed();
    }

    public void setPrice() {
        notAllowed();
    }
}
