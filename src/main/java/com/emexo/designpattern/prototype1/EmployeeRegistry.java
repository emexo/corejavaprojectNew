package com.emexo.designpattern.prototype1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistry {
    private static final Map<String, Employee> EMPLOYEE_PROTOTYPES = new HashMap<>();

    // Load initial prototypes
    static {
        Employee dev = new Employee("John Doe", "Development", 75000);
        dev.addCertification("Java 8");
        EMPLOYEE_PROTOTYPES.put("developer", dev);

        Employee manager = new Employee("Jane Smith", "Management", 120000);
        manager.addCertification("PMP");
        EMPLOYEE_PROTOTYPES.put("manager", manager);
    }

    public static Employee getEmployee(String type) {
        Employee prototype = EMPLOYEE_PROTOTYPES.get(type.toLowerCase());
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("Invalid Employee Type: " + type);
    }
}