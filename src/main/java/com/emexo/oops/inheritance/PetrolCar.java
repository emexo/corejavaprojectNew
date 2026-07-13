package com.emexo.oops.inheritance;

/**
 * Inheritance Example: PetrolCar class extending Car
 */
public class PetrolCar extends Car{
    private double fuelEfficiency; // in km/l

    public PetrolCar(String brand, String model, int year, double fuelEfficiency) {
        super(brand, model, year);
        this.fuelEfficiency = fuelEfficiency;
    }

    public void displayFuelEfficiency() {
        displayInfo();
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }

    /**
     * method overriding example
     */
    @Override
    public void displayInfo() {
        System.out.println("This is a Petrol Car.");
    }
}
