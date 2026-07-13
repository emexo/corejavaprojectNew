package com.emexo.javafeatures.java8.methodreference;

import java.util.*;

/**
 * Reference to an instance method of an arbitrary object of a particular type
 *
 * Syntax: ClassName::instanceMethod
 */
public class MethodRefExample3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "spring");

        // Lambda
        list.forEach(s -> System.out.println(s.toUpperCase()));

        // Method Reference
        list.forEach(System.out::println);

        // Another example
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}