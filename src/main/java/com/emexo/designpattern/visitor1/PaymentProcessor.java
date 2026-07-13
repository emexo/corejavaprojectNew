package com.emexo.designpattern.visitor1;

import java.util.List;

public class PaymentProcessor {

    public static void main(String[] args) {

        List<Payment> payments = List.of(
                new CreditCardPayment(10000),
                new UpiPayment(5000)
        );

        PaymentVisitor fraudCheck =
                new FraudCheckVisitor();

        PaymentVisitor feeCalc =
                new FeeCalculationVisitor();

        PaymentVisitor audit =
                new AuditVisitor();

        for (Payment payment : payments) {
            payment.accept(fraudCheck);
            payment.accept(feeCalc);
            payment.accept(audit);
        }
    }
}