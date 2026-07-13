package com.emexo.designpattern.adapter;

// Simulating an existing third-party Stripe API
class StripeAPI {
    void chargeAmount(double inrAmount) {
        System.out.println("Payment of ₹" + inrAmount + " processed via Stripe.");
    }
}

// Adapter to integrate Stripe with our system
class StripeAdapter implements PaymentGateway {
    private final StripeAPI stripeAPI = new StripeAPI();

    @Override
    public void processPayment(double amount) {
        // Assuming USD to INR conversion rate is 1 USD = 83 INR
        double convertedAmount = amount * 83;
        stripeAPI.chargeAmount(convertedAmount);
    }
}