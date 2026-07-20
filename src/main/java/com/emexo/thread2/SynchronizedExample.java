package com.emexo.thread2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SynchronizedExample {
    static void main() {
        SynchronizedExample example=new SynchronizedExample();
        SynchronizedExample example1=new SynchronizedExample();
        Runnable runnable = ()->{
            example.print();
        };
        Runnable runnable1 = ()->{
            example1.print();
        };


        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable1);

        t1.start();
        t2.start();

    }



    public   void  print(){
        synchronized (SynchronizedExample.class) {
            log.info(Thread.currentThread().getName() + " inside the print");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName() + " exist the print");
        }
    }
}
