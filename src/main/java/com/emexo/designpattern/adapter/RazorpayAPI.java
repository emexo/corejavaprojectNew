package com.emexo.designpattern.adapter;

// Simulating an existing third-party Razorpay API
class RazorpayAPI {
    void payAmountInRupees(double rupees) {
        System.out.println("Payment of ₹" + rupees + " processed via Razorpay.");
    }
}

// Adapter to integrate Razorpay with our system
class RazorpayAdapter implements PaymentGateway {
    private final RazorpayAPI razorpayAPI = new RazorpayAPI();

    @Override
    public void processPayment(double amount) {
        // Assuming USD to INR conversion rate is 1 USD = 83 INR
        double convertedAmount = amount * 83;
        razorpayAPI.payAmountInRupees(convertedAmount);
    }
}