package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    static void main() {
        log.info(Thread.currentThread().getName() + " start");

        OrderTask orderTask1 = new OrderTask();
        OrderTask orderTask2 = new OrderTask();

        Thread t1=new Thread(orderTask1);
        t1.setPriority(10);
        t1.run();


        Thread t2 = new Thread(orderTask2);
        t2.start();

        log.info(Thread.currentThread().getName() + " end");
    }
}
