package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class BankAccount {

    private State state = new PositiveState ();
    public double getBalance() {
        return balance;
    }

    private double balance = 0.0;



    public void setBalance(double balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void debit (double amount) {
        state = state.debit(this, amount);

    }
    public void credit (double amount) {
        state = state.debit (this,amount);

    }
    public void close (){
        state = state.close (this);

    }

}
