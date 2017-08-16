package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public abstract class State {

    public abstract State debit (BankAccount account, double amount);
    public abstract State credit (BankAccount account, double amount);
    public abstract State close (BankAccount account);
}
