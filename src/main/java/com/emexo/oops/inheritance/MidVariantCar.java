package com.emexo.oops.inheritance;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MidVariantCar  extends  BaseModelCar{

    private String features;

    public MidVariantCar(String carType, String model, String features){
        super(carType, model);
        this.features = features;
    }

    @Override
    public Integer getEngine(String engineType){
        log.info("Engine TYpe:{}", engineType);
        return null;
    }

    public void getMidVariantCar(){
        getEngine();
        getCarColor();
        log.info("Mid Variant");
    }
}
