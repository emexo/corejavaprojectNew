package com.emexo.method;

public class Student {
    public static String getCollegeName(String name) {
        return "Emexo College".concat(" - ").concat(name);
    }

    static void main() {
        String collegeName = Student.getCollegeName("John Doe");
        System.out.println(collegeName);
    }
}
