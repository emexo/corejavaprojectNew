package com.emexo.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    public static String getOrgName(){
        String orgName = "Emexo Pvt Ltd";
        return orgName;
    }

    public static void getOrgName(String name){
        log.info("Organization Name: " + name);
    }

    public int getEmployeeId(){
        int empId = 101;
        return empId;
    }

    public static void main(String[] args) {
     String name =  Employee.getOrgName();
     log.info(name);

     Employee.getOrgName("Dell Technologies");

     Employee employee = new Employee();
     int response = employee.getEmployeeId();
     log.info("Employee ID: " + response);
    }
}
