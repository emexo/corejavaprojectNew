package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunnableWithLambda {
    static void main() {
        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + " Started");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                log.error("Interrupted exception");
            }
            log.info(Thread.currentThread().getName() + " End");

        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();
    }
}
