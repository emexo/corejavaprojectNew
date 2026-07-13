package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info(Thread.currentThread().getName() + " - start");
        OrderTask orderTask1 = new OrderTask();
        OrderTask orderTask2 = new OrderTask();

        Thread t1 = new Thread(orderTask1);
        t1.setName("order1");
        t1.start();

        Thread t2 = new Thread(orderTask2);
        t2.setName("order2");
        t2.start();

        log.info(Thread.currentThread().getName() + "- end");
    }
}
