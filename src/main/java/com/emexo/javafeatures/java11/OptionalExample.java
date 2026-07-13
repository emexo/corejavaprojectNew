package com.emexo.javafeatures.java11;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        OptionalExample example = new OptionalExample();

        Optional<Integer> result = example.add(5, 10);

        if(result.isEmpty()) {
            System.out.println("The sum is: " + result.get());
        }
    }

    public Optional<Integer> add(int a, int b) {
        return Optional.ofNullable(a + b);
    }
}
