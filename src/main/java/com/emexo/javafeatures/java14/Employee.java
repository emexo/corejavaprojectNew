package com.emexo.javafeatures.java14;

public class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        // implementation
        return true;
    }

    @Override
    public int hashCode() {
        // implementation
        return 0;
    }
}