package com.usersguide.Controller;

import com.usersguide.Objects.UserRequest;
import com.usersguide.Service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by kamkalet on 11.07.2017.
 */

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<UserRequest> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{login}", method = RequestMethod.GET)
    public UserRequest getUserByLogin(@PathVariable("login") String userLogin){
        return userService.getUserByLogin(userLogin);
    }

    @RequestMapping(value = "/{login}", method = RequestMethod.DELETE)
    public void deleteUserByLogin(@PathVariable("login") String userLogin){
        userService.removeUserByLogin(userLogin);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertUser(@RequestBody UserRequest userRequest){
        userService.insertUser(userRequest);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserRequest userRequest){
        userService.updateUser(userRequest);
    }

}
