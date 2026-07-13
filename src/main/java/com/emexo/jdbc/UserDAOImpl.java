package com.emexo.jdbc;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class UserDAOImpl implements UserDAO{
    @Override
    public int save(User user) {
        int response=0;
        try(Connection connection = DBConnection.getConnection()){
            String sql = "insert into users(id, username, password, fullname, email) values (nextval('users_id_seq'), ?, ? , ? , ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.username());
            statement.setString(2, user.password());
            statement.setString(3, user.fullName());
            statement.setString(4, user.email());

            response = statement.executeUpdate();
        } catch (Exception ex){
            log.error("Exception while saving the user details");
        }
        log.info("Inserted the user details, no of rows inserted:{}", response);
        return  response;
    }

    // insert - String sql = "INSERT INTO users(id, username, password, fullname, email) VALUES (users_id_seq.NEXTVAL, ?, ?, ?, ?)";
    // update and delete - assignment
    //String updateSql = "UPDATE users SET username = ?, password = ?, fullname = ?, email = ? WHERE id = ?";
    //String deleteSql = "DELETE FROM users WHERE id = ?";

    public List<User> getAllUser(){
        String sql = "select * from users";
        List<User> userList = new ArrayList<>();
        try(Connection connection = DBConnection.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);


           while (resultSet.next()){
               User user = new User(resultSet.getInt("id"), resultSet.getString("username"),
                       resultSet.getString("password"), resultSet.getString("fullname"),
                       resultSet.getString("email"));
               userList.add(user);
           }
        }catch (Exception ex){
            log.error("Exception while retrieving the users");
        }

        return userList;
    }
}
