package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ticket extends Thread{

    public void run(){
       log.info(Thread.currentThread().getName() + " Started");

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            log.error("Exception");
        }

        log.info(Thread.currentThread().getName() + " End");
    }
}
