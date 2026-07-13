package com.emexo.javafeatures.java21;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BankingVirtualThreadExecutor {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            int customerId = 101;

            // Multiple tasks using single Callable class

            List<Callable<Object>> tasks = List.of(

                    new BankingTask("VALIDATE", customerId),

                    new BankingTask("BALANCE", customerId),

                    new BankingTask("TRANSACTIONS", customerId),

                    new BankingTask("FRAUD", customerId),

                    new BankingTask("NOTIFICATION", customerId)
            );

            // Execute all tasks together

            List<Future<Object>> futures =
                    executor.invokeAll(tasks);

            // Retrieve results

            String validationResult =
                    (String) futures.get(0).get();

            Double balance =
                    (Double) futures.get(1).get();

            List<String> transactions =
                    (List<String>) futures.get(2).get();

            String fraudResult =
                    (String) futures.get(3).get();

            String notificationResult =
                    (String) futures.get(4).get();

            // Final Output

            System.out.println("\n======= FINAL RESPONSE =======");

            System.out.println(validationResult);

            System.out.println("Balance : " + balance);

            System.out.println("Transactions : "
                    + transactions);

            System.out.println(fraudResult);

            System.out.println(notificationResult);

            long end = System.currentTimeMillis();

            System.out.println(
                    "\nTotal Time : "
                            + (end - start) + " ms"
            );
        }
    }
}