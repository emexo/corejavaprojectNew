package com.emexo.thread2;

public class Main {
    static void main() {
        OrderTask orderTask1 = new OrderTask();
        OrderTask orderTask2 = new OrderTask();

        Thread t1 = new Thread(orderTask1);
        t1.start();

        Thread t2 = new Thread(orderTask2);
        t2.start();

    }
}
