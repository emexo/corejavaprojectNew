package com.emexo.javafeatures.java12;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileCompare {
    public static void main(String[] args) throws Exception {

        Path file1 = Path.of("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/file1.txt");
        Path file2 = Path.of("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/file2.txt");

        long result = Files.mismatch(file1, file2);

        if(result == -1) {
            System.out.println("Files are identical");
        } else {
            System.out.println(
                    "Mismatch found at byte position: " + result
            );
        }
    }
}
