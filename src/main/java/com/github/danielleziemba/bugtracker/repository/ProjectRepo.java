package com.github.danielleziemba.bugtracker.repository;

import com.github.danielleziemba.bugtracker.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {

}
