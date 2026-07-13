package com.emexo.oops.interface2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    static void main() {
        Animal dog = new Dog();
        dog.move();
        //dog.bark();
        log.info("Animal Type: " + Animal1.ANIMAL_TYPE);
        dog.makeSound();
    }
}
