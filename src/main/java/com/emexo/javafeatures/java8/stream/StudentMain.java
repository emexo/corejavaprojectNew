package com.emexo.javafeatures.java8.stream;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Alice", 82));
        listStudents.add(new Student("Bob", 90));
        listStudents.add(new Student("Carol", 67));
        listStudents.add(new Student("David", 80));
        listStudents.add(new Student("Eric", 55));
        listStudents.add(new Student("Frank", 49));
        listStudents.add(new Student("Gary", 88));
        listStudents.add(new Student("Henry", 98));
        listStudents.add(new Student("Ivan", 66));
        listStudents.add(new Student("John", 52));

        // top 3 students with score >= 70
       List<Student> goodStudents = listStudents.stream()
               .filter(student -> student.getScore()>=70)
               .parallel()
               .sorted(Comparator.comparing(Student::getName).reversed())
               .limit(3)
               .collect(Collectors.toList());

   List<String> names =   listStudents.stream()
               .map(student -> student.getName())
               .toList();


        List<Student> students = listStudents.parallelStream()
                .map(student -> {
                    student.setScore(student.getScore() + 5);
                    return student;
                })
                .toList();

        log.info(students);


    }
}