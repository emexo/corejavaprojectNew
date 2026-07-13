package com.emexo.designpattern.abstractfactory1;

public class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new ConcreteFactory();
    }
}