package com.github.danielleziemba.bugtracker;

import com.github.danielleziemba.bugtracker.entity.Project;
import com.github.danielleziemba.bugtracker.entity.User;
import com.github.danielleziemba.bugtracker.service.ProjectService;
import com.github.danielleziemba.bugtracker.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BugtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugtrackerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService, ProjectService projectService) {
		return args -> {
			userService.saveUser(new User(null, "daniellez", "1234"));
			userService.saveUser(new User(null, "natashar", "1234"));
			userService.saveUser(new User(null, "jamesbb", "1234"));
			userService.saveUser(new User(null, "stever", "1234"));

			projectService.saveProject(new Project("Bugtracker Application", "stuff about the project", "In Progress"));
		};
	}

}
