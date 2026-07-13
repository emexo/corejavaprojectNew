package com.emexo.thread1.yield;

import java.util.concurrent.atomic.AtomicInteger;

public class YieldExample {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        Runnable politeWorker = () -> {
            String name = Thread.currentThread().getName();

            for (int i = 0; i < 5; i++) {
                System.out.println(name + " processing step " + i);

                // Simulate work
                heavyComputation();

                // Give chance to other threads

                Thread.yield();
                System.out.println(name + " yielding...");
            }
        };

        Runnable aggressiveWorker = () -> {
            String name = Thread.currentThread().getName();

            for (int i = 0; i < 5; i++) {
                System.out.println(name + " processing step " + i);

                // Simulate work
                heavyComputation();
            }
        };

        Thread t1 = new Thread(politeWorker, "Polite-Thread");
        Thread t2 = new Thread(aggressiveWorker, "Aggressive-Thread-1");
        Thread t3 = new Thread(aggressiveWorker, "Aggressive-Thread-2");

        t1.start();
        t2.start();
        t3.start();
    }

    private static void heavyComputation() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.incrementAndGet();
        }
    }
}