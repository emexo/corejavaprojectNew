package com.emexo.designpattern.adapter;

// Common interface that all payment gateways must follow
public interface PaymentGateway {
    void processPayment(double amount);
}