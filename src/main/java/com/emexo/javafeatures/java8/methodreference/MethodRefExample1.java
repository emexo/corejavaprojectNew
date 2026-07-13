package com.emexo.javafeatures.java8.methodreference;

import java.util.*;

/**
 * Reference to a static method
 *
 * Syntax: ClassName::staticMethod
 */
public class MethodRefExample1 {
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Java", "8");

        // Lambda
        list.forEach(s -> MethodRefExample1.printMessage(s));

        // Method Reference
        list.forEach(MethodRefExample1::printMessage);
    }
}