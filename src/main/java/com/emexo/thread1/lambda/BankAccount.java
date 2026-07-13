package com.emexo.thread1.lambda;

public class BankAccount {
    private int balance = 1000;

    public void withdraw(String user, int amount) {

        if(balance >= amount) {
            System.out.println(user + " is withdrawing " + amount);

            try {
                Thread.sleep(6000); // simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(user + " insufficient balance");
        }
    }
}
