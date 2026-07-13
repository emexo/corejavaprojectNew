package com.emexo.thread1.countdownlatch;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;
@Log4j2
class Service implements Runnable{
    private final String name;
    private final int timeToStart;
    private final CountDownLatch latch;

    public Service(String name, int timeToStart, CountDownLatch latch){
        this.name = name;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }
    @Override
    public void run() {
        System.out.println("Starting " + name);
        try {
            Thread.sleep(timeToStart);
        } catch (InterruptedException ex) {
            log.error(ex.getMessage());
        }
        System.out.println( name + " is Up");
        latch.countDown(); //reduce count of CountDownLatch by 1
    }
}
