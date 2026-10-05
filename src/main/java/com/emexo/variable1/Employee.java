package com.emexo.variable1;

import lombok.extern.log4j.Log4j2;

/**
 * Variable example
 * @Author Regu
 */
@Log4j2
public class Employee {
    // static variable
    public static final String ORG_NAME = "JPMC";

    //instance variable
    private int employeeId;
    private String employeeName;

    public static void main(String[] args){
        log.info(Employee.ORG_NAME);

        //create an object
        Employee employee1 = new Employee();
        employee1.employeeId = 100;
        employee1.employeeName = "Natalia";

        log.info("Employee id:{} and employee name:{}",employee1.employeeId, employee1.employeeName);
    }
}


