package com.github.danielleziemba.bugtracker.controller;

import com.github.danielleziemba.bugtracker.entity.Project;
import com.github.danielleziemba.bugtracker.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public ResponseEntity<List<Project>> listProjects() {
        return ResponseEntity.ok().body(projectService.getAllProjects());
    } // will need to be returned as a page eventually, limiting the results

}
