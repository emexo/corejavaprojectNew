package com.emexo.serialization;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Log4j2
public class Main {
    public static final String fileName = "/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/account.ser";

    public static void main(String[] args) {
        Main main = new Main();
        Account account = new Account();
        account.setAccountNo(34);
        account.setAccountName("Dee");
        main.serialize(fileName, account);
        main.deserialize(fileName);
    }

    public void serialize(String fileName, Account account){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
            outputStream.writeObject(account);
        }catch (Exception ex){
            log.error("Exception while serialization", ex);
        }
    }

    public void deserialize(String fileName){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            Account account = (Account)objectInputStream.readObject();
            log.info(account);
        }catch (Exception ex){
            log.info("Exception while deserialization", ex);
        }
    }
}
