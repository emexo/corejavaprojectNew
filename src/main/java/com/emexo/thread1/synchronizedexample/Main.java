package com.emexo.thread1.synchronizedexample;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
            Account account2 = new Account();

        // Create multiple threads to perform withdrawals
        Thread t1 = new Thread(() -> account1.withdraw(7000));
        Thread t2 = new Thread(() -> account2.withdraw(7000));


        // Start the threads
        t1.start();
        t2.start();

    }
}
