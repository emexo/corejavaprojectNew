package com.emexo.oops.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    static void main() {
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.engine();
        petrolCar.gearBox();
        log.info(Car.CAR_TYPE);
        petrolCar.gearBox();
        Car.carType();


    }
}
