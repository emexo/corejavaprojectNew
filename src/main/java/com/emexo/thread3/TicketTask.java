package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketTask  extends Thread{
    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + " start");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName() + " end");
    }
}
