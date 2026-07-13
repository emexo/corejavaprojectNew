package com.emexo.designpattern.factory1;

// PartTimeEmployee.java
public class PartTimeEmployee implements Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Salary based on hours worked
    }
}
