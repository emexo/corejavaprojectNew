package com.emexo.javafeatures.java22;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;

public class RunningSumExample {

    public static void main(String[] args) {

        Gatherer<Integer, AtomicInteger, Integer> runningSum =
                Gatherer.ofSequential(
                        AtomicInteger::new,

                        (state, element, downstream) -> {

                            int sum =
                                    state.addAndGet(element);

                            downstream.push(sum);

                            return true;
                        }
                );

        List.of(1, 2, 3, 4)
                .stream()
                .gather(runningSum)
                .forEach(System.out::println);
    }
}

