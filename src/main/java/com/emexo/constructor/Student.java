package com.emexo.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {
    // instance variable
    private int studentId;
    private String studentName;

    /**
     * Default constrctor
     */
    public Student(){
        this.studentId = 00;
        this.studentName = "xxx";
    }

    /**
     * Parameterized construcor
     * @param id
     * @param name
     */
    public Student(int id, String name){
        this.studentId = id;
        this.studentName = name;
    }

    static void main() {
        Student student = new Student(1, "Regu");
        log.info("Account id:{} and account name:{}", student.studentId, student.studentName);
    }
}
