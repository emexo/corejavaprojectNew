package com.emexo.designpattern.abstractfactory1;

public abstract class AbstractFactory {
    public abstract BankAccount getBankAccount(String type);
    public abstract Loan getLoan(String type);
}