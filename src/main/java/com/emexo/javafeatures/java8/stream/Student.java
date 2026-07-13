package com.emexo.javafeatures.java8.stream;

import lombok.*;

@Getter
@Setter
@ToString
public class Student  {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }



}