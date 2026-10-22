package com.emexo.oops.abstract2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class Car {
    public static final String CAR_TYPE = "Manual";

    private String model;
    private int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    public abstract void engine();

    public void gearBox(){
        log.info("Gear Box");
    }
}
