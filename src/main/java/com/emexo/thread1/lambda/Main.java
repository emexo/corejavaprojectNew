package com.emexo.thread1.lambda;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Runnable task1 = () -> {
            account.withdraw("User-1", 100);
        };

        Runnable task2 = () -> {
            account.withdraw("User-2", 100);
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
