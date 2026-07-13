package com.emexo.designpattern.visitor1;

public class CreditCardPayment implements Payment {

    private double amount;

    public CreditCardPayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void accept(PaymentVisitor visitor) {
        visitor.visit(this);
    }
}