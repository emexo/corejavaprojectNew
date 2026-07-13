package com.emexo.designpattern.factory1;

/**
 * Many applications support multiple payment methods (Credit Card, PayPal, Google Pay, UPI, etc.).
 * Many modern applications send different types of notifications (SMS, Email, Push).
 * Applications may need to connect to different cloud providers based on pricing, availability, or region.
 * Applications may need to connect to different databases based on environment (dev, prod) or client preferences.
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee fullTimeEmp = EmployeeFactory.getEmployee("fulltime");
        System.out.println("Full-time Employee Salary: " + fullTimeEmp.calculateSalary());

        Employee partTimeEmp = EmployeeFactory.getEmployee("parttime");
        System.out.println("Part-time Employee Salary: " + partTimeEmp.calculateSalary());

        Employee contractEmp = EmployeeFactory.getEmployee("contract");
        System.out.println("Contract Employee Salary: " + contractEmp.calculateSalary());
    }
}