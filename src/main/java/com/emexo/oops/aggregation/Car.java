package com.emexo.oops.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
         this.make = make;
         this.model = model;
         this.engine = engine;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void getCarDetails() {
        log.info("Car Make: " + make);
        log.info("Car Model: " + model);
        log.info("Engine Type: " + engine.getType());
        log.info("Engine Horsepower: " + engine.getHorsepower());
    }
}
