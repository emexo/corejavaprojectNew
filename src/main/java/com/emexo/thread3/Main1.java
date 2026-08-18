package com.emexo.thread3;

public class Main1 {
    static void main() {
        TicketTask t1 = new TicketTask();
        t1.start();

        TicketTask t2 = new TicketTask();
        t2.start();
    }
}
