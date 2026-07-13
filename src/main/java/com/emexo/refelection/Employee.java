package com.emexo.refelection;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    private int employeeId;
    public String employeeName;

    private void getEmployeeId(){
        log.info(employeeId);
    }

    public void getEmployeeName(String lastName){
        log.info(employeeName.concat(lastName));
    }

}
