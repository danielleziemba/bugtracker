package com.github.danielleziemba.bugtracker.service;

import com.github.danielleziemba.bugtracker.entity.Role;
import com.github.danielleziemba.bugtracker.entity.User;

import java.util.List;

public interface UserService {

    /****************************************
     * BUSINESS LOGIC IS DEFINED IN SERVICE *
     ****************************************/

    List<User> getAllUsers();

    User getUser(String username);

    User saveUser(User user);

    Role saveRole(Role role);

}
