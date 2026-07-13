package com.emexo.thread1.blockingqueue;

import java.util.concurrent.*;

class Order {
    private final int id;

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class BlockingQueuePipeline {

    private static final int TOTAL_ORDERS = 10;

    // Queues
    private static final BlockingQueue<Order> validationQueue = new ArrayBlockingQueue<>(5);
    private static final BlockingQueue<Order> processingQueue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Producer
        executor.submit(() -> {
            try {
                for (int i = 1; i <= TOTAL_ORDERS; i++) {
                    Order order = new Order(i);
                    validationQueue.put(order);
                    System.out.println("Produced Order: " + order.getId());
                    Thread.sleep(200);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        // Validator Workers (2 threads)
        Runnable validator = () -> {
            try {
                while (true) {
                    Order order = validationQueue.take();
                    System.out.println(Thread.currentThread().getName() +
                            " Validating Order: " + order.getId());

                    Thread.sleep(300); // simulate validation

                    processingQueue.put(order);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        };

        executor.submit(validator);
        executor.submit(validator);

        // Processor Workers (2 threads)
        Runnable processor = () -> {
            try {
                while (true) {
                    Order order = processingQueue.take();
                    System.out.println(Thread.currentThread().getName() +
                            " Processing Order: " + order.getId());

                    Thread.sleep(500); // simulate processing

                    System.out.println("Completed Order: " + order.getId());
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        };

        executor.submit(processor);
        executor.submit(processor);

        executor.shutdown();
    }
}
