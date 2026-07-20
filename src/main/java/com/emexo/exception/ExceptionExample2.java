package com.emexo.exception;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

@Log4j2
public class ExceptionExample2 {
    static void main() {
        ExceptionExample2 exceptionExample2 = new ExceptionExample2();
        String inputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/inputFile.txt";
        String outputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/outputFile.txt";
        try {
            exceptionExample2.readFromFile1(inputFile, outputFile);
        } catch (FileNotFoundException e){
            log.error("Invalid input file");
        }

    }

    public void readFromFile(String inputFile, String outputFile) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream(inputFile);
            fileOutputStream  = new FileOutputStream(outputFile);

            int data;

            while ((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }
        } catch (Exception e){
            log.error("Exception while reading the data from file");
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }

    }

    public void readFromFile1(String inputFile, String outputFile) throws FileNotFoundException {
        if(inputFile == null){
            log.error("Invalid input file");
            throw new FileNotFoundException("Invalid input file");
        }

        try(FileInputStream fileInputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream  = new FileOutputStream(outputFile);){


            int data;

            while ((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }
        } catch (Exception e){
            log.error("Exception while reading the data from file");
        }

    }
}
