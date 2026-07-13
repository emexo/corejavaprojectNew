package com.emexo.iostream.characterstream;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

@Log4j2
public class Main {
    public static void main(String[] args) {
        String inputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/file1.txt";
        String outputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/outfile.txt";

        Main main = new Main();
        main.read(inputFile, outputFile);
    }

    public void read(String inputFile, String outputFile){
        try(FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile)) {

            int data;

            while ((data = fileReader.read()) != -1){
                fileWriter.write(data);
            }

        } catch (Exception ex){
            log.error("Exception while reading/writing the data from file");
        }
    }

}
