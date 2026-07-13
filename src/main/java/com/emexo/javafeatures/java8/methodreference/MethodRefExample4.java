package com.emexo.javafeatures.java8.methodreference;

import java.util.function.Supplier;

public class MethodRefExample4 {
    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new;
        supplier.get();
    }
}
