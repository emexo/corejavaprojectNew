package com.emexo.thread1.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TicketMain {
    public static void main(String[] args) {
        log.info("Starting ticket booking...");
        Ticket ticket1 = new Ticket(150.0, "Alice", "New York");
        Ticket ticket2 = new Ticket(200.0, "Bob", "Los Angeles");
        Ticket ticket3 = new Ticket(120.0, "Charlie", "Chicago");

        Thread thread1 = new Thread(ticket1, "Thread-1"); // ready to run
        Thread thread2 = new Thread(ticket2, "Thread-2");
        Thread thread3 = new Thread(ticket3, "Thread-3");
        thread1.setPriority(Thread.MAX_PRIORITY); // setting priority
        thread1.start(); //running
        thread2.start();
        thread3.start();
        log.info("Ticket booking initiated for all passengers.");

    }
}
