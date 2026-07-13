package com.emexo.designpattern.factory1;

// FullTimeEmployee.java
public class FullTimeEmployee implements Employee {
    private double baseSalary;

    public FullTimeEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Fixed salary for full-time employees
    }
}




