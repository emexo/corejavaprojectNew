package com.emexo.thread1.runnable;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class Ticket implements Runnable{

    private double price;
    private String passengerName;
    private String destination;

    @Override
    public void run() {
        log.info(Thread.currentThread().getName() + " is booking ticket for " + passengerName);

            try {
                Thread.sleep(6000); // Simulate time taken to book a ticket
            } catch (InterruptedException e) {
                log.error("Thread interrupted: " + e.getMessage());
            }

        log.info("Ticket booked for " + passengerName + " to " + destination + " at price $" + price);
    }
}
