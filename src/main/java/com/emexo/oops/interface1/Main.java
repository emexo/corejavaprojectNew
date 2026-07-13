package com.emexo.oops.interface1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.move();
        System.out.println("Animal Type: " + Animal.ANIMAL_TYPE);
        dog.food();

        Animal.getAnimalType();
    }
}
