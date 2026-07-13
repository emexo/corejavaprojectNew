package com.emexo.designpattern.singleton.serialization;

import java.io.*;

public class CFG {
    public static void main(String[] args)
    {
        try
        {
            Singleton instance1 = Singleton.instance;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/file.ser"));
            out.writeObject(instance1);
            out.close();

            // deserailize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/file.ser"));

            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- " + instance1.hashCode());
            System.out.println("instance2 hashCode:- " + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
