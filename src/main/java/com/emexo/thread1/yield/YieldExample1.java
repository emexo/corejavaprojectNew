package com.emexo.thread1.yield;

class YieldExample1 extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);

            if (i == 5) {
                System.out.println(Thread.currentThread().getName() + " is yielding...");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldExample1 t1 = new YieldExample1();
        YieldExample1 t2 = new YieldExample1();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t2.setPriority(Thread.MAX_PRIORITY); // Set higher priority for t2
        t1.start();
        t2.start();
    }
}