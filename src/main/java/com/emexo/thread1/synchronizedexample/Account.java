package com.emexo.thread1.synchronizedexample;

/**
 * Synchronized example: Account class representing a bank account with synchronized methods for deposit and withdrawal.
 * This class is used to demonstrate how to synchronize access to shared resources (the account balance) in a multi-threaded environment to
 */
public class Account {
    private static double balance = 10000.0; // Initial balance

    // Synchronized method to withdraw money from the account
    public synchronized void withdraw(double amount) {

        System.out.printf("Thread %s is attempting to withdraw: %.2f%n", Thread.currentThread().getName(), amount);
        try {
           Thread.yield(); // Simulate time taken for withdrawal process
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }else {
                System.out.println("Insufficient funds for withdrawal of: " + amount + ", Current Balance: " + balance);
        }
        System.out.printf("Thread %s has completed the withdrawal process.%n", Thread.currentThread().getName());
    }

    public double getBalance() {
        return balance;
    }
}
