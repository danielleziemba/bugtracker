package com.github.danielleziemba.bugtracker.service;

import com.github.danielleziemba.bugtracker.entity.User;
import com.github.danielleziemba.bugtracker.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
