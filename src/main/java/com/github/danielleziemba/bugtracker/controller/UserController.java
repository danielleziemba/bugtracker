package com.github.danielleziemba.bugtracker.controller;

import com.github.danielleziemba.bugtracker.entity.User;
import com.github.danielleziemba.bugtracker.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> listUsers() {
        return ResponseEntity.ok().body(userService.getAllUsers());
    } // will need to be returned as a page eventually, limiting the results

}
