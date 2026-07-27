package com.emexo.collection.set;

import lombok.extern.log4j.Log4j2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeId(18);
        employee1.setEmployeeName("John Doe");

        Employee employee2 = new Employee();
        employee2.setEmployeeId(2);
        employee2.setEmployeeName("Jane Smith");

        Employee employee3 = new Employee();
        employee3.setEmployeeId(15);
        employee3.setEmployeeName("John Doe88");

      Set<Employee> set = new TreeSet<>(Comparator.comparing(Employee::getEmployeeName));
      set.add(employee1);
      set.add(employee2);
      set.add(employee3);


      log.info(set);

    }
}
