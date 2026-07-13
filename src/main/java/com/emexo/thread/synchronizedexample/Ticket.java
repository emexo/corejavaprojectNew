package com.emexo.thread.synchronizedexample;

public class Ticket {

    public synchronized void  bookTicket() throws InterruptedException {
        System.out.println("Enter the saveTicket: "+ Thread.currentThread().getName());

        Thread.sleep(6000);

        System.out.println("Exit the saveTicket: "+ Thread.currentThread().getName());
    }

    public void  bookTicket2() throws InterruptedException {

        synchronized (Ticket.class) {
            System.out.println("Enter the saveTicket:: "+ Thread.currentThread().getName());
            Thread.sleep(6000);
            System.out.println("Exit the saveTicket:: "+ Thread.currentThread().getName());
        }

    }
}
