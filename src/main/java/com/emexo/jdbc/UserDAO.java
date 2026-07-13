package com.emexo.jdbc;

import java.util.List;

public interface UserDAO {
    int save(User user);
    List<User> getAllUser();
}
