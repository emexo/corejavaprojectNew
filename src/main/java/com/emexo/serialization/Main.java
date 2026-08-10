package com.emexo.serialization;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Log4j2
public class Main {
    static void main() throws Exception {
        String file = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/employee.ser";

        Employee employee = new Employee();
        employee.setEmpId(2);
        employee.setEmpName("Regu");
        employee.setAddress("Bengaluru");
        employee.setMob(93452345);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(employee);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Employee employee1 = (Employee) objectInputStream.readObject();
        log.info(employee1);
    }
}
