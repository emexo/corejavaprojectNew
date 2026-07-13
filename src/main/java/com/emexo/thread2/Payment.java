package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Payment extends Thread{

    public void run(){
        log.info(Thread.currentThread().getName() + "- start");
        try {
            wait(12000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName() + "- end");
    }
}
