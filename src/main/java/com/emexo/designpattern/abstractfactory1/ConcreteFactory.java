package com.emexo.designpattern.abstractfactory1;

public class ConcreteFactory extends AbstractFactory {
    @Override
    public BankAccount getBankAccount(String type) {
        return BankAccountFactory.getAccount(type);
    }

    @Override
    public Loan getLoan(String type) {
        return LoanFactory.getLoan(type);
    }
}