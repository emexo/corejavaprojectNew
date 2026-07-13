package com.emexo.iostream.bytestream;

import lombok.extern.log4j.Log4j2;

import java.awt.desktop.OpenURIEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@Log4j2
public class Main {
    public static void main(String[] args) {
        String inputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/file1.txt";
        String outputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/outfile.txt";

        Main main = new Main();
        main.read(inputFile, outputFile);
    }

    public void read(String inputFile, String outputFile){
        try(FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile)) {

            int data;

            while ((data = inputStream.read()) != -1){
                outputStream.write(data);
            }

        } catch (Exception ex){
            log.error("Exception while reading/writing the data from file");
        }
    }

}
