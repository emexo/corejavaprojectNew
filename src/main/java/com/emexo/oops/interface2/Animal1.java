package com.emexo.oops.interface2;

public interface Animal1 {

    String ANIMAL_TYPE = "Mammal"; // public static final by default


    void move();    // public abstract by default

    default void makeSound() {
        System.out.println("Animal is making a sound");
    }

    static void staticMethod() {
        System.out.println("This is a static method in the Animal interface");
    }
}
