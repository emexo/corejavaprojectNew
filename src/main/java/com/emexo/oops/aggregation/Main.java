package com.emexo.oops.aggregation;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V6", 301);
        Car car = new Car("Toyota", "Camry", engine);
        car.getCarDetails();
    }
}
