package com.github.danielleziemba.bugtracker.repository;

import com.github.danielleziemba.bugtracker.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByRoleName(String roleName);

}
