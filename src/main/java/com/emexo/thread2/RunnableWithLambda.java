package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + "- Start");
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + "- end");
        };

        Thread t1 = new Thread(runnable);
        t1.setName("order1");
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.setName("order2");
        t2.start();
    }
}
