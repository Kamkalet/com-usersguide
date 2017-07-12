package com.usersguide.Dao;

import com.usersguide.Objects.UserRequest;

import java.util.Collection;

/**
 * Created by kamkalet on 11.07.2017.
 */
public interface IUserDao {

    Collection<UserRequest> getAllUsers();

    UserRequest getUserByLogin(String userLogin);

    int removeUserByLogin(String userLogin);

    void updateUser(UserRequest userRequest);

    void insertUserToDb(UserRequest userRequest);
}
