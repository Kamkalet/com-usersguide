package com.usersguide.Dao.impl;

import com.usersguide.Dao.IUserDao;
import com.usersguide.Objects.UserRequest;
import com.usersguide.persistence.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by kamkalet on 11.07.2017.
 */

@Repository("mysql")
public class UserDao implements IUserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Collection<UserRequest> getAllUsers(){

        return jdbcTemplate.query(
                "select UserLogin, Name, Surname, DateOfBirth, Password " +
                        "from users.Users",
                new UserRowMapper());

    }

    @Override
    public UserRequest getUserByLogin(String userLogin){

        return jdbcTemplate.queryForObject(
                "select UserLogin, Name, Surname, DateOfBirth, Password" +
                        " from users.Users" +
                        "where UserLogin = ?",
                new UserRowMapper());

    }

    @Override
    public int removeUserByLogin(String userLogin){

        return jdbcTemplate.update("delete from users.Users " +
                "where UserLogin = ?", userLogin);
    }

    @Override
    public void updateUser(UserRequest userRequest){
        final String userLogin = userRequest.getLogin();
        final String name = userRequest.getName();
        final String surname = userRequest.getSurname();
        final String dateOfBirth = userRequest.getDateOfBirth();
        final String password = userRequest.getPassword();
        jdbcTemplate.update("update users.Users set UserLogin = ?, Name = ?, Surname = ?, DateOfBirth = ?, Password = ?" +
                "where UserLogin = ?", userLogin, name, surname, dateOfBirth, password);
    }

    @Override
    public void insertUserToDb(UserRequest userRequest){
        final String userLogin = userRequest.getLogin();
        System.out.println(userLogin);
        final String name = userRequest.getName();
        final String surname = userRequest.getSurname();
        final String dateOfBirth = userRequest.getDateOfBirth();
        final String password = userRequest.getPassword();
        jdbcTemplate.update("insert into users.Users " +
                "values (?,?,?,?,?)", userLogin, name, surname, dateOfBirth, password);
    }

}
