package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OrderTaskWithRunnable {

    static void main() {
        Runnable runnable =  () -> {
            log.info(Thread.currentThread().getName() + " start");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + " end");
        };

        Thread t1=new Thread(runnable);
        t1.start();
        Thread t2 = new Thread(runnable);
        t2.start();
    }
}
