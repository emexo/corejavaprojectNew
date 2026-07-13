package com.emexo.iostream.bufferedstream;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
        try(BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile))) {

            String data;

            while ((data = fileReader.readLine()) != null){
                fileWriter.write(data);
            }

        } catch (Exception ex){
            log.error("Exception while reading/writing the data from file");
        }
    }

}
