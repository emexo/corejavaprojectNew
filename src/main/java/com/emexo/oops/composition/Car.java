package com.emexo.oops.composition;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private String make;
    private String model;
    private final Engine engine;

    public Car(String make, String model, String engineType, int horsepower) {
         this.make = make;
         this.model = model;
         this.engine = new Engine(engineType, horsepower);

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void getCarDetails() {
        log.info("Car Make: " + getMake());
        log.info("Car Model: " + getModel());
        log.info("Engine Type: " + engine.getType());
        log.info("Engine Horsepower: " + engine.getHorsepower());
    }
}
