package com.github.danielleziemba.bugtracker.service.implementation;

import com.github.danielleziemba.bugtracker.entity.Role;
import com.github.danielleziemba.bugtracker.entity.User;
import com.github.danielleziemba.bugtracker.repository.RoleRepo;
import com.github.danielleziemba.bugtracker.repository.UserRepo;
import com.github.danielleziemba.bugtracker.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;
    private RoleRepo roleRepo;

    public UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByRoleName(roleName);
    }
}
