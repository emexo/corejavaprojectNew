package com.emexo.thread1.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Main class to demonstrate the use of Payment and ExecutorService.
 * This class will create multiple Payment tasks and execute them using an ExecutorService.
 */
public class Main {
    public static void main(String[] args) {
       Payment payment1 = new Payment("P001", "Alice", "Bob", 100.0);
       Payment payment2 = new Payment("P002", "Charlie", "Dave", 200.0);
       Payment payment3 = new Payment("P003", "Eve", "Frank", 300.0);
       Payment payment4 = new Payment("P004", "Grace", "Heidi", 400.0);
       Payment payment5 = new Payment("P005", "Ivan", "Judy", 500.0);

       List<Payment> payments = Arrays.asList(payment1, payment2, payment3, payment4, payment5);

        ExecutorService service = Executors.newFixedThreadPool(3);

        List<Future<Payment>> futures = null;

        try {
            futures = service.invokeAll(payments);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       futures.forEach(future -> {
           try {
               Payment payment = future.get();
               System.out.println("Payment ID: " + payment.getPaymentId() + ", Creditor: " + payment.getCreditor() + ", Debtor: " + payment.getDebtor() + ", Amount: " + payment.getAmount());
           } catch (Exception e) {
               e.printStackTrace();
           }
       });

       // service.shutdown();
    }
}
