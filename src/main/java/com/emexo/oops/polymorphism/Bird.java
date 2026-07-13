package com.emexo.oops.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Bird implements Animal{
    @Override
    public void move() {
        log.info("Bird is flying");
    }
}
