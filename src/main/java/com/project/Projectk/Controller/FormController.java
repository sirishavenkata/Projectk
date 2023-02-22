package com.project.Projectk.Controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Projectk.Dto.Formrequest;
import com.project.Projectk.Entity.FormModel;
import com.project.Projectk.Entity.SkillsModel;
import com.project.Projectk.Mapper.formskillMapper;
import com.project.Projectk.Service.FormService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormController {
	
	@Autowired
	private FormService service;
	
	
	@GetMapping("/getskills")
	public List<SkillsModel> getskills() {
		return service.getskills();
	}
	
	@PostMapping(value="/saveuser")
	public ResponseEntity<FormModel> createUser(@RequestBody FormModel model){
		     ResponseEntity<FormModel> modelform=service.createuserform(model);
			return modelform;
		     
		
	}
	
	@GetMapping("/getforms")
	public List<FormModel> getformdata() {
	     return service.getformdata();
	}
	
	
	

	
	
	
	
}
