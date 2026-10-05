package com.emexo.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    private int employeeId;
    private String employeeName;

    /**
     * Default Constructor
     */
    public Employee(){
        this.employeeId =1;
        this.employeeName ="XXX";
    }

    /**
     * Parameterized constructor
     * @param id
     * @param name
     */
    public Employee(int id, String name){
        this.employeeId = id;
        this.employeeName = name;
    }

    static void main() {
        Employee employee = new Employee(100, "Natalia");
        log.info("Employee id:{} and employee name:{}", employee.employeeId, employee.employeeName);
    }
}
