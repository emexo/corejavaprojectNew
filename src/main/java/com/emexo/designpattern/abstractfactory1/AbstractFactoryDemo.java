package com.emexo.designpattern.abstractfactory1;

/**
 * Banking System (Loan & Account Creation)
 *
 * We will design an abstract factory that provides different types of:
 * 	1.	Bank Accounts (Savings, Current)
 * 	2.	Loans (Home Loan, Car Loan)
 *
 * Each category (Bank Account & Loan) will have its own factory, and we will use an Abstract Factory to produce them dynamically.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory();

        // Create Bank Accounts
        BankAccount savings = factory.getBankAccount("savings");
        savings.accountType();  // Output: Savings Account Created.

        BankAccount current = factory.getBankAccount("current");
        current.accountType();  // Output: Current Account Created.

        // Create Loans and Calculate EMI
        Loan homeLoan = factory.getLoan("home");
        System.out.println("Home Loan EMI: " + homeLoan.calculateLoanEMI(500000, 10));

        Loan carLoan = factory.getLoan("car");
        System.out.println("Car Loan EMI: " + carLoan.calculateLoanEMI(300000, 5));
    }
}