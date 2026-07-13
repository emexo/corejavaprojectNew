package com.emexo.serialization;

import java.io.*;

public class ProductMain {
    public static final String fileName = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/product.ser";


    public static void main(String[] args) throws Exception {
        Product product = new Product(101, "Smartphone", 699.99);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        objectOutputStream.writeObject(product);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));

        Product deserializedProduct = (Product) objectInputStream.readObject();

        System.out.printf("Deserialized Product: %s%n", deserializedProduct);
        objectInputStream.close();
    }
}
