package com.emexo.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        PetrolCar myPetrolCar = new PetrolCar("Toyota", "Corolla", 2020, 15.5);
        myPetrolCar.displayFuelEfficiency();
        myPetrolCar.displayInfo();
    }
}
