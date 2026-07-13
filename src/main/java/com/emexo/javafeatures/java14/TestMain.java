package com.emexo.javafeatures.java14;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Ajay" ,1);
        log.info(employeeRecord.empId());
        log.info(employeeRecord.empName());
        log.info(employeeRecord.toString());
    }
}
