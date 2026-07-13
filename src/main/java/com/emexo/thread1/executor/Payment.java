package com.emexo.thread1.executor;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Callable;

@Getter
@Log4j2
public class Payment implements Callable<Payment> {
    private String paymentId;
    private String creditor;
    private String debtor;
    private double amount;

    /**
     * Constructor for Payment.
     * @return
     * @throws Exception
     */
    public Payment(String paymentId, String creditor, String debtor, double amount) {
        this.paymentId = paymentId;
        this.creditor = creditor;
        this.debtor = debtor;
        this.amount = amount;
    }

    @Override
    public Payment call() throws Exception {
        log.info("Processing payment: " + paymentId);
        // Simulate processing time
        Thread.sleep(9000);
        log.info("Payment processed: " + paymentId);
        return this;
    }
}
