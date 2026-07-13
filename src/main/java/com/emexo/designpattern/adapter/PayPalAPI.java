package com.emexo.designpattern.adapter;

// Simulating an existing third-party PayPal API
class PayPalAPI {
    void makePayment(double usdAmount) {
        System.out.println("Payment of $" + usdAmount + " processed via PayPal.");
    }
}

// Adapter to integrate PayPal with our system
class PayPalAdapter implements PaymentGateway {
    private final PayPalAPI paypalAPI = new PayPalAPI();

    @Override
    public void processPayment(double amount) {
        paypalAPI.makePayment(amount);
    }
}