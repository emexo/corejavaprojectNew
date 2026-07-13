package com.emexo.oops.interface2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Dog implements Animal, Animal1{
    @Override
    public void move() {
        log.info("Dog is running");
    }

    @Override
    public void makeSound() {
        Animal1.super.makeSound();
    }

    public void bark() {
        log.info("Dog is barking");
        Animal.staticMethod();
    }


}
