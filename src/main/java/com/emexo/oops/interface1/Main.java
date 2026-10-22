package com.emexo.oops.interface1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    static void main() {
        Car petrolCar = new PetrolCar();

        petrolCar.engine();
        petrolCar.gearBox();
        log.info(Car.CAR_TYPE);
        Car.carType();




    }
}
