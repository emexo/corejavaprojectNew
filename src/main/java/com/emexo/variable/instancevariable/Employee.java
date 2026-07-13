package com.emexo.variable.instancevariable;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
       Employee employee1 = new Employee("John", 30);
       log.info("Employee Name: " + employee1.name);
       log.info("Employee Age: " + employee1.age);

       Employee employee2 = new Employee("Alice", 25);
       log.info("Employee Name: " + employee2.name);
       log.info("Employee Age: " + employee2.age);
    }

}
