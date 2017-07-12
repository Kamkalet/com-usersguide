package com.usersguide.Service.impl;

import com.usersguide.Dao.impl.UserDao;
import com.usersguide.Objects.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
/**
 * Created by kamkalet on 11.07.2017.
 */

@Service
public class UserService {

    @Qualifier("mysql")
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Collection<UserRequest> getAllUsers(){
        return userDao.getAllUsers();
    }

    public UserRequest getUserByLogin(String userLogin){
        return userDao.getUserByLogin(userLogin);
    }

    public void updateUser(UserRequest userRequest){
        this.userDao.updateUser(userRequest);
    }

    public void removeUserByLogin(String userLogin){
        this.userDao.removeUserByLogin(userLogin);
    }

    public void insertUser(UserRequest userRequest) {
        this.userDao.insertUserToDb(userRequest);
    }

}
