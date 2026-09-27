package com.emexo.oops.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ElectricCar implements Car{
    @Override
    public void engine() {
        log.info("Electric engine");
    }
}
