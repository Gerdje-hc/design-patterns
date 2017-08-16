package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class PositiveState extends State {
    public State debit (BankAccount account,double amount) {
    return null;
    }

    public State credit (BankAccount account, double amount){
    account.setBalance((account.getBalance() - amount));
    if (account.getBalance()<0){
        return new InCreditState();
    }

        if(account.getBalance() < -1_000) {
    return new BankRuptState();

    }
    return this;
}

    @Override
    public State close(BankAccount account) {
        account.setBalance(0.0);
        return new ClosedState();
    }
}


