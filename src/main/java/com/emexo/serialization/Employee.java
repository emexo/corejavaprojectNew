package com.emexo.serialization;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;


import java.io.Serializable;

// convert object into byte- serialization
// convert byte into Object - deserialization

@Log4j2
public class Employee implements Serializable {

    private static final long serialVersionUID = 788886693750L;

    public static final String ORG_NAME = "JPMC";

    private transient int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void getEmpDetails(){
        log.info("Employee Id:{}, and Employee Name:{}",employeeId, employeeName );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
