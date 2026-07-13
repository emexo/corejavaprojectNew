package com.emexo.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class Employee {
    private String empName;
    private int empId;
/*

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }
*/

    static void main() {
        Employee employee = new Employee("John Doe", 123);

    }
}
