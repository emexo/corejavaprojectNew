package com.emexo.oops.abstract2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PetrolCar extends Car{
    private String engineType;

    public PetrolCar( String engineType, String model, int year) {
        super(model, year);
        this.engineType = engineType;
    }

    @Override
    public void engine() {
        log.info("Petrol Engine");
    }

    public void petrolCarDetails(){
        log.info("Petrol Car Details");
        gearBox();
    }
}
