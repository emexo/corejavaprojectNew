package com.emexo.javafeatures.java8.methodreference;

import java.util.*;

/**
 * Reference to an instance method of a particular object
 *
 * Syntax: instance::method
 */
public class MethodRefExample2 {
    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        MethodRefExample2 obj = new MethodRefExample2();
        List<String> list = Arrays.asList("A", "B", "C");

        // Method Reference
        list.forEach(s -> obj.display(s));
        list.forEach(obj::display);
    }
}