package com.emexo.iostream.bufferedstream;

import com.emexo.iostream.bytestream.Main;
import lombok.extern.log4j.Log4j2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@Log4j2
public class Main1 {
    public static void main(String[] args) {
        String inputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/inputFile.txt";
        String outputFile = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/outputFile.txt";

        com.emexo.iostream.bytestream.Main main = new Main();
        main.read(inputFile, outputFile);
    }


    public void read(String inputFile, String outputFile){
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile))){

            int data;

            while ( (data = inputStream.read()) != -1){
                outputStream.write(data);
            }

        } catch (Exception ex){
            log.error("Exception while read/write the data from file");
        }
    }
}
