package com.emexo.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DBConnection {
    public static String getConnection() {
        String str = "DB Connection established";
        return str;
    }

    public void getUser() {
        String str = "User fetched from DB";
        log.info(str);
    }

    static void main() {
        String str = DBConnection.getConnection();
        log.info(str);

        DBConnection dbConnection = new DBConnection();
        dbConnection.getUser();
    }
}
