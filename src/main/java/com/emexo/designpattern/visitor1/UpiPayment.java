package com.emexo.designpattern.visitor1;

public class UpiPayment implements Payment {

    private double amount;

    public UpiPayment(double amount) {
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