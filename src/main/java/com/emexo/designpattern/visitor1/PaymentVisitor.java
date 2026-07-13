package com.emexo.designpattern.visitor1;

public interface PaymentVisitor {

    void visit(CreditCardPayment payment);

    void visit(UpiPayment payment);
}