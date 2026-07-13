package com.emexo.oops.composition1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private String model;
    private int year;
    private final Engine engine;

    public Car(String model, int year, String enginePower, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(enginePower, engineType);
    }

    public void getCarDetails(){
        engine.getEngineDetails();
        log.info("Car model:{} and year:{}", model, year);
    }
}
