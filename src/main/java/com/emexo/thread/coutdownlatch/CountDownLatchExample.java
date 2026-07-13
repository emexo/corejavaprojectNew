package com.emexo.thread.coutdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        Thread t0 = new Thread( new OrderTask(countDownLatch, 6000));
        t0.start();

        Thread t1 = new Thread( new OrderTask(countDownLatch, 9000));
        t1.start();

        Thread t2 = new Thread( new OrderTask(countDownLatch, 12000));
        t2.start();

        countDownLatch.await();

        System.out.println(Thread.currentThread().getName() + " thread finish the execution");
    }
}
