package com.emexo.designpattern.singleton.enum1;

public class Main {
    public static void main(String[] args) {
        // Access the singleton instance
        Singleton singleton = Singleton.INSTANCE;

        // Use the instance
        singleton.showMessage();

        // Example of setting and getting a value
        singleton.setValue(42);
        System.out.println("Value: " + singleton.getValue());
    }
}

