package com.emexo.thread1.lambda;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class TicketExample {
    public static void main(String[] args) {
            double price = 150.0;
            String passengerName = "Alice";
            String destination = "New York";

        Runnable runnable = () -> {
            log.info(Thread.currentThread().getName() + " is booking ticket for " + passengerName);

            try {
                Thread.sleep(6000); // Simulate time taken to book a ticket
            } catch (InterruptedException e) {
                log.error("Thread interrupted: " + e.getMessage());
            }

            log.info("Ticket booked for " + passengerName + " to " + destination + " at price $" + price);
        };

        log.info("All booking tasks completed.");
    }
}
