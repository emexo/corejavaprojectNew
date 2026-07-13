package com.emexo.designpattern.abstractfactory1;

public class CurrentAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("Current Account Created.");
    }
}