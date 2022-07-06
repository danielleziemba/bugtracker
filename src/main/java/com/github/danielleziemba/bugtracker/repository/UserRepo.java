package com.github.danielleziemba.bugtracker.repository;

import com.github.danielleziemba.bugtracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    /**************************************
     * BASIC CRUD OPERATIONS ONLY IN REPO *
     **************************************/

}
