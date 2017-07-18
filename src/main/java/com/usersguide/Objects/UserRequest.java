package com.usersguide.Objects;

import java.util.List;

/**
 * Created by kamkalet on 11.07.2017.
 */
public class UserRequest {

    private String userLogin;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;

    public UserRequest() {
    }

    public UserRequest(String login, String password, String name, String surname, String dateOfBirth) {
        this.userLogin = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String login) {
        this.userLogin = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
