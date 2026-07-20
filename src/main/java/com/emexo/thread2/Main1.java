package com.emexo.thread2;

public class Main1 {
    static void main() {
        Ticket ticket = new Ticket();
        ticket.start();

        Ticket ticket1 = new Ticket();
        ticket1.start();
    }
}
