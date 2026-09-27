package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Log4j2
public class OrderMain {
    static void main() throws InterruptedException {
        OrderMain orderMain = new OrderMain();
        List<Callable<String>> orderTasks = new ArrayList<>();

        Callable<String> callable = ()->{
            log.info(Thread.currentThread().getName()+ " start");
            Thread.sleep(12000);
            log.info(Thread.currentThread().getName()+ " end");
            return "ww";
        };

        orderTasks.add(orderMain.orderTask(1, "iphone", 90000.4f));
        orderTasks.add(orderMain.orderTask(4, "macbook", 4000.4f));
        orderTasks.add(orderMain.orderTask(4, "oneplus", 6000.4f));
        orderTasks.add(orderMain.orderTask(4, "Mi", 9000.4f));
        orderTasks.add(orderMain.orderTask(5, "Samsung", 70000.4f));
        orderTasks.add(orderMain.orderTask(5, "google", 60000.4f));

       try(ExecutorService service = Executors.newVirtualThreadPerTaskExecutor()) {

           List<Future<String>> futures = service.invokeAll(orderTasks);

           futures.forEach(data -> {
               try {
                   log.info(data.get());
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           });
       }
    }

    private Callable<String> orderTask(int orderId, String product, float amount) {
        Callable<String> callable = ()->{
            log.info(Thread.currentThread().getName()+ " start");
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info(Thread.currentThread().getName()+ " end");
            return orderId + " : " + product + " : "+ amount;

        };
        return callable;
    }
}
