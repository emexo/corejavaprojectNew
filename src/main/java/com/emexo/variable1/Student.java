package com.emexo.variable1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {
    // instance variable
    private int studentId = 10;
    private String studentName = "Regu";

    static void main() {
        Student student = new Student();
        log.info(student.studentId);
        log.info(student.studentName);

        var bonusMark =10;
    }
}
