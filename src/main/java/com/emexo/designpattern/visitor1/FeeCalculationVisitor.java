package com.emexo.designpattern.visitor1;

public class FeeCalculationVisitor implements PaymentVisitor {

    @Override
    public void visit(CreditCardPayment payment) {

        double fee = payment.getAmount() * 0.02;

        System.out.println("Credit Card Fee = " + fee);
    }

    @Override
    public void visit(UpiPayment payment) {

        System.out.println("UPI Fee = 0");
    }
}