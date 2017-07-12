package com.usersguide.persistence;

import com.usersguide.Objects.UserRequest;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kamkalet on 12.07.2017.
 */
public class UserRowMapper implements RowMapper<UserRequest> {

    @Override
    public UserRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserRequest userRequest = new UserRequest();
        userRequest.setLogin(rs.getString("UserLogin"));
        userRequest.setName(rs.getString("Name"));
        userRequest.setSurname(rs.getString("Surname"));
        userRequest.setDateOfBirth(rs.getString("DateOfBirth"));
        userRequest.setPassword(rs.getString("Password"));
        return userRequest;
    }
}
