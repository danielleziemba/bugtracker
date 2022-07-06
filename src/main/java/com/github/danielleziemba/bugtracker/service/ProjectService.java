package com.github.danielleziemba.bugtracker.service;

import com.github.danielleziemba.bugtracker.entity.Project;

import java.util.List;

public interface ProjectService {

    Project saveProject(Project project);

    // to be limited with auths?
    List<Project> getAllProjects();

}
