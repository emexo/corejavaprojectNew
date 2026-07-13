package com.emexo.oops.composition1;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Engine {
    private String enginePower;
    private String engineType;

    public Engine(String enginePower, String engineType){
        this.enginePower =  enginePower;
        this.engineType = engineType;
    }


    public void getEngineDetails(){
        log.info("Engine power:{} and engine type:{}", enginePower, engineType);
    }
}
