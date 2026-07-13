package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OrderTask implements Runnable{
    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + "- Start");
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName() + "- end");
    }
}
