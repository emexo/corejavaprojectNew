package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThreadJoin {
    static void main() throws InterruptedException {

        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + " start");
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            log.info(Thread.currentThread().getName() + " end");
        };


        Thread t1 = new Thread(runnable);
        t1.start();

        t1.join();

        Thread t2 = new Thread(runnable);
        t2.start();
    }
}
