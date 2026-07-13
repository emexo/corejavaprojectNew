package com.emexo.oops.inheritance;

/**
 * Inheritance Example: Car class
 */
public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo()  {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    /**
     * method overloading example
     */
    public void displayInfo(String color) {
        displayInfo();
        System.out.println("Car Color: " + color);
    }

}
