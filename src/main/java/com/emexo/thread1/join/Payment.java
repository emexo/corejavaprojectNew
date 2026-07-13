package com.emexo.thread1.join;

/**
 * Thread join example
 */
public class Payment {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println("Payment started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Payment completed");
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        t1.join();

        Thread t2 = new Thread(runnable);
        t2.start();


    }
}
