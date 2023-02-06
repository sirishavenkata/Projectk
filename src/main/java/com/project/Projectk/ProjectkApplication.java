package com.project.Projectk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.Projectk.Entity.SkillsModel;
import com.project.Projectk.Repository.Skillsrepository;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableAutoConfiguration
public class ProjectkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectkApplication.class, args);
	}
    

}
