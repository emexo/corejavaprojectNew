package com.emexo.collection.list;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

@Log4j2
public class Main {
    static void main() {
        List<Employee> employees = new LinkedList<>();

        Employee employee1 = new Employee();
        employee1.setEmpId(10);
        employee1.setEmpName("Ajay");

        Employee employee2 = new Employee();
        employee2.setEmpId(2);
        employee2.setEmpName("Ajay");

        employees.add(employee1);
        employees.add(employee2);

       // employees.sort(Comparator.comparing(Employee::getEmpId).reversed());
        employees.sort(Comparator.comparing(Employee::getEmpName, Comparator.nullsLast(String::compareTo)));

        log.info(employees);
    }
}
