package com.emexo.designpattern.visitor1;

public interface Payment {
    void accept(PaymentVisitor visitor);
}