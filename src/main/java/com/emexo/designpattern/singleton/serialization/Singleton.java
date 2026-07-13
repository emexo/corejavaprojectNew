package com.emexo.designpattern.singleton.serialization;

import java.io.Serializable;

public class Singleton implements Serializable {
    // public instance initialized when loading the class
    public static Singleton instance = new Singleton();

    private Singleton()
    {
        // private constructor
    }
    protected Object readResolve()
    {
        return instance;
    }
}
