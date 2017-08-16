package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class BankRuptState extends State{
    @Override
    public State debit(BankAccount account, double amount) {

        return null;
    }

    @Override
    public State credit(BankAccount account, double amount) {
        return this;
    }

    @Override
    public State close(BankAccount account) {
        return this;
    }
}
