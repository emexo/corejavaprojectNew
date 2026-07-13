package com.emexo.designpattern.abstractfactory1;

public class SavingsAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("Savings Account Created.");
    }
}