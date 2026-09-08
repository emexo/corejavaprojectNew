package com.emexo.thread1.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class CountDownLatchDemo {
    public static void main(String args[]) {
        final CountDownLatch latch = new CountDownLatch(4); //creating CountDownLatch for 3 services
        Thread cacheService = new Thread(new Service("CacheService", 3000, latch));
        Thread alertService = new Thread(new Service("AlertService", 6000, latch));
        Thread validationService = new Thread(new Service("ValidationService", 9000, latch));

        cacheService.start(); //separate thread will initialize CacheService
        alertService.start(); //another thread for AlertService initialization
        validationService.start();

        try{
            latch.await(1, TimeUnit.MINUTES);  //main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now");
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

