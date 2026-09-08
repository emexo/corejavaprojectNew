package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Log4j2
public class OrderMain {
    static void main() throws InterruptedException {

        OrderTask task1 = new OrderTask(1, "iphone", 90000.4f);
        OrderTask task2 = new OrderTask(4, "macbook", 4000.4f);
        OrderTask task3 = new OrderTask(4, "oneplus", 6000.4f);
        OrderTask task4 = new OrderTask(4, "Mi", 9000.4f);
        OrderTask task5 = new OrderTask(5, "Samsung", 70000.4f);
        OrderTask task6 = new OrderTask(5, "google", 60000.4f);
        OrderTask task7 = new OrderTask(5, "iphone", 779678.7f);

        ExecutorService service = Executors.newFixedThreadPool(3);

        List<OrderTask> orderTasks = new ArrayList<>();
        orderTasks.add(task1);
        orderTasks.add(task2);
        orderTasks.add(task3);
        orderTasks.add(task4);
        orderTasks.add(task5);
        orderTasks.add(task6);
        orderTasks.add(task7);

        List<Future<String>> futures = service.invokeAll(orderTasks);

        futures.forEach(data-> {
            try {
                log.info(data.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
