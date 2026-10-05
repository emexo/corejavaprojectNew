package com.emexo.javafeatures.java22;

import java.util.List;
import java.util.stream.Gatherers;

public class GathererExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .gather(Gatherers.windowFixed(4))
                .forEach(System.out::println);
    }
}
