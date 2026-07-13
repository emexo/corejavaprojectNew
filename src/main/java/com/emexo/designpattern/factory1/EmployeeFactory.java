package com.emexo.designpattern.factory1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EmployeeFactory {
    private static final Map<String, Supplier<Employee>> employeeMap = new HashMap<>();

    // Register employee types using lambdas
    static {
        employeeMap.put("fulltime", () -> new FullTimeEmployee(50000));
        employeeMap.put("parttime", () -> new PartTimeEmployee(500, 40));
        employeeMap.put("contract", () -> new ContractEmployee(30000, 5000));
    }

    // Factory Method
    public static Employee getEmployee(String type) {
        Supplier<Employee> employee = employeeMap.get(type.toLowerCase());
        if (employee != null) {
            return employee.get();
        }
        throw new IllegalArgumentException("Invalid Employee Type: " + type);
    }
}
