package com.emexo.designpattern.prototype1;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Prototype<Employee> {
    private String name;
    private String department;
    private double salary;
    private List<String> certifications;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.certifications = new ArrayList<>();
    }

    public void addCertification(String cert) {
        certifications.add(cert);
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Department: " + department + ", Salary: " + salary);
        System.out.println("Certifications: " + certifications);
    }

    // Deep Copy using Java 8 Streams
    @Override
    public Employee clone() {
        Employee clone = new Employee(this.name, this.department, this.salary);
        clone.certifications = new ArrayList<>(this.certifications);  // Deep copy of certifications
        return clone;
    }
}