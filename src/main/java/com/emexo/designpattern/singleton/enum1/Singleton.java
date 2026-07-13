package com.emexo.designpattern.singleton.enum1;

public enum Singleton {
    INSTANCE; // Only one instance will ever exist

    // Any additional fields can be added here
    private int value;

    // Getter and setter methods (optional)
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Any other methods for the singleton functionality
    public void showMessage() {
        System.out.println("Singleton instance with enum!");
    }
}
