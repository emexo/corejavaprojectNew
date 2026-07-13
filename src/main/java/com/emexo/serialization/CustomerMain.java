package com.emexo.serialization;

import java.io.*;

public class CustomerMain {

    public static final String fileName = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/customer.ser";

    public static void main(String[] args) {
        CustomerMain main = new CustomerMain();
        try {
            main.serialization();
            main.deSerialization();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void serialization() throws IOException {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Regu");
        customer.setAddress("Bangalore");

        ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream(fileName));
        outputStream.writeObject(customer);
    }

    public void  deSerialization() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream(fileName));
        Customer customer  = (Customer) inputStream.readObject();
        System.out.println(customer);
    }
}
