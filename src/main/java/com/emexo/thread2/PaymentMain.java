package com.emexo.thread2;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment1 = new Payment();
        payment1.start();

        Payment payment2 = new Payment();
        payment2.start();

    }
}
