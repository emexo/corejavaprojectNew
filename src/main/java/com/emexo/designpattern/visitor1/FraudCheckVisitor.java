package com.emexo.designpattern.visitor1;

public class FraudCheckVisitor implements PaymentVisitor {

    @Override
    public void visit(CreditCardPayment payment) {

        System.out.println(
            "Running fraud rules for Credit Card Payment"
        );
    }

    @Override
    public void visit(UpiPayment payment) {

        System.out.println(
            "Running fraud rules for UPI Payment"
        );
    }
}