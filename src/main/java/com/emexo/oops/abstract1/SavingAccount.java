package com.emexo.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SavingAccount extends Account {

    public SavingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        log.info("Depositing " + amount + " to Saving Account");
        balance += amount;
        log.info("New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        log.info("Withdrawing " + amount + " from Saving Account");
        if (amount > balance) {
            log.info("Insufficient balance!");
        } else {
            balance -= amount;
            log.info("New balance: " + balance);
        }
    }

    public void savingAccount(){
        System.out.println("saving account");
    }

}
