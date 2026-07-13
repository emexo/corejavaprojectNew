package com.emexo.jdbc;

import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Natalia", "Natalia111", "Natalia Taye", "natalia@gmail.com");
        UserDAO userDAO = new UserDAOImpl();
        int result = userDAO.save(user);
        log.info("Result of saving user: {}", result);
    }
}
