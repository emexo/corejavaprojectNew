package com.emexo.designpattern.singleton.reflection;

public class Singleton {
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();

    private Singleton()
    {
        // private constructor
    }
}
