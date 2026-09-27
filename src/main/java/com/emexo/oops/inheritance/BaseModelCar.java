package com.emexo.oops.inheritance;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BaseModelCar {
    private String carType;
    private String model;

    public BaseModelCar(String carType, String model){
        this.carType = carType;
        this.model = model;
    }

    public void getEngine(){
      log.info("Base model engine");
    }

    public Number getEngine(String engineType){
        log.info("Engine TYpe:{}", engineType);
        return null;
    }

    public void getCarColor(){
        log.info("White");
    }
}
