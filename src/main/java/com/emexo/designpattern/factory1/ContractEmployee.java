package com.emexo.designpattern.factory1;

// ContractEmployee.java
public class ContractEmployee implements Employee {
    private double fixedAmount;
    private double bonus;

    public ContractEmployee(double fixedAmount, double bonus) {
        this.fixedAmount = fixedAmount;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return fixedAmount + bonus; // Fixed contract salary + bonus
    }
}
