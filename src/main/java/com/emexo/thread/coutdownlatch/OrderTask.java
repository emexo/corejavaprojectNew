package com.emexo.thread.coutdownlatch;

import java.util.concurrent.CountDownLatch;

public class OrderTask implements Runnable{

    private CountDownLatch countDownLatch;
    private int threadToSleep;

    public OrderTask(CountDownLatch countDownLatch, int threadToSleep) {
        this.countDownLatch = countDownLatch;
        this.threadToSleep = threadToSleep;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Starting");
        try {
            Thread.sleep(threadToSleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
        System.out.println(Thread.currentThread().getName() + " End");
    }
}
