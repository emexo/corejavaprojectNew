package com.emexo.designpattern.adapter;

/**
 * A company wants to integrate multiple payment gateways (e.g., PayPal, Stripe, Razorpay)
 * into its e-commerce platform. However, each payment gateway has its own API,
 * making direct integration cumbersome. To solve this, we use the Adapter Design Pattern,
 * which allows the system to interact with different payment providers using a common interface.
 */
public class PaymentProcessor {
    public static void main(String[] args) {
        // Choosing the required payment gateway dynamically
        PaymentGateway paypal = new PayPalAdapter();
        PaymentGateway stripe = new StripeAdapter();
        PaymentGateway razorpay = new RazorpayAdapter();

        // Processing payments
        System.out.println("Processing Payments:");
        paypal.processPayment(100);  // $100 via PayPal
        stripe.processPayment(100);  // $100 converted to INR via Stripe
        razorpay.processPayment(100); // $100 converted to INR via Razorpay
    }
}