package com.emexo.collection.set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String employeeName;

    // overriding equals and hashCode to ensure proper comparison in HashSet


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeId);
    }

    @Override
    public int compareTo(Employee emp) {
        return this.getEmployeeName().compareTo(emp.getEmployeeName());
    }
}
