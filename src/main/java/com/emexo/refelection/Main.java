package com.emexo.refelection;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class Main {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee();
        Class<Employee> employeeClass = (Class<Employee>) employee.getClass();

        Field field = employeeClass.getDeclaredField("employeeId");
        field.setAccessible(true);
        field.set(employee, 345);
       log.info(field.get(employee));

       Field field1 = employeeClass.getDeclaredField("employeeName");
       field1.set(employee, "Joe");
       log.info(field1.get(employee));

        Method method = employeeClass.getDeclaredMethod("getEmployeeId");
        method.setAccessible(true);
        method.invoke(employee);

        Method method1 = employeeClass.getDeclaredMethod("getEmployeeName", String.class);
        method1.invoke(employee, " Gadel");

       Field[] fields =  employeeClass.getDeclaredFields();
       for(Field field2: fields){
           log.info(field2);
       }

       Method[] methods = employeeClass.getDeclaredMethods();
       for(Method method2: methods){
           log.info(method2);
       }

    }
}
