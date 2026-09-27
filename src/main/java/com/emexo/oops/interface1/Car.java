package com.emexo.oops.interface1;

public interface Car {
    //public static final String CAR_TYPE= "Passenger";
    String CAR_TYPE= "Passenger";

    //public abstract void engine();
    void engine();


    public default void gearBox(){
        print();
    }

    public static String carType(){
        return CAR_TYPE;
    }

    private void print(){
        System.out.println("Private Method");
    }
}//
