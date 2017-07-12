package com.usersguide.Objects;

import java.util.List;

/**
 * Created by kamkalet on 11.07.2017.
 */
public class UserGroup {

    private String name;
    private List<UserRequest> userRequestList;

    public UserGroup() {
    }

    public UserGroup(String name, List<UserRequest> userRequestList) {
        this.name = name;
        this.userRequestList = userRequestList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserRequest> getUserRequestList() {
        return userRequestList;
    }

    public void setUserRequestList(List<UserRequest> userRequestList) {
        this.userRequestList = userRequestList;
    }
}
