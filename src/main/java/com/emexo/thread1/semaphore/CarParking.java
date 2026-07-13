package com.emexo.thread1.semaphore;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Semaphore example: Car Parking
 */
@Log4j2
public class CarParking {
    Semaphore parkingSpots = new Semaphore(3 ); // 3 parking spots available

    public void parkCar(String carName) {
        try {
            log.info(carName + " is trying to park.");
            parkingSpots.acquire(); // Acquire a parking spot
            log.info(carName + " has parked.");
            Thread.sleep(12000); // Simulate time taken to park
            log.info(carName + " is leaving the parking spot.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            parkingSpots.release(); // Release the parking spot
        }
    }

    public static void main(String[] args) {
        CarParking carParking = new CarParking();

        // Simulate multiple cars trying to park
        for (int i = 1; i <= 10; i++) {
            final String carName = "Car " + i;
            new Thread(() -> carParking.parkCar(carName)).start();
        }
    }

}
