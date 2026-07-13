package com.emexo.designpattern.visitor1;

public class AuditVisitor implements PaymentVisitor {

    @Override
    public void visit(CreditCardPayment payment) {

        System.out.println(
            "Audit log for Credit Card Payment"
        );
    }

    @Override
    public void visit(UpiPayment payment) {

        System.out.println(
            "Audit log for UPI Payment"
        );
    }
}