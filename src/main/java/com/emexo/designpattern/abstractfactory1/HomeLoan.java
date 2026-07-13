package com.emexo.designpattern.abstractfactory1;

public class HomeLoan implements Loan {
    private static final double INTEREST_RATE = 7.5; // Annual Rate

    @Override
    public double calculateLoanEMI(double amount, int years) {
        double monthlyRate = INTEREST_RATE / 12 / 100;
        int months = years * 12;
        return (amount * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }
}