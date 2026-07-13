package com.emexo.javafeatures.java21;

import java.util.List;

public class Bank {
    public static String validateCustomer(int customerId)
            throws InterruptedException {

        Thread.sleep(1000);

        return "Customer Validated : " + customerId
                + " by " + Thread.currentThread();
    }

    public static Double fetchBalance(int customerId)
            throws InterruptedException {

        Thread.sleep(1500);

        return 25000.75;
    }

    public static List<String> fetchTransactions(int customerId)
            throws InterruptedException {

        Thread.sleep(1200);

        return List.of(
                "Amazon - 2000",
                "Swiggy - 500",
                "Fuel - 3000"
        );
    }

    public static String fraudCheck(int customerId)
            throws InterruptedException {

        Thread.sleep(800);

        return "Fraud Check Passed";
    }

    public static String sendNotification(int customerId)
            throws InterruptedException {

        Thread.sleep(500);

        return "Notification sent by : "
                + Thread.currentThread();
    }

}
