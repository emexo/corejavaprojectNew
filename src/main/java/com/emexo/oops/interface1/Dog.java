package com.emexo.oops.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Dog implements Animal, Animal1{
    @Override
    public void move() {
        log.info("Dog is running");
    }

    @Override
    public void food() {
        Animal1.super.food();
    }
}
