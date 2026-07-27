package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThreadSleep {
    static void main() {
        ThreadSleep threadSleep = new ThreadSleep();
        Runnable runnable = ()->{
            try {
                threadSleep.print();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        Thread t2 = new Thread(runnable);
        t2.start();
    }

    public synchronized void print() throws InterruptedException {
        log.info(Thread.currentThread().getName() + " Start");
        wait (9000);
        log.info(Thread.currentThread().getName() + " End");
    }
}
