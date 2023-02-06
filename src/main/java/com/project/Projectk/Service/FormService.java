package com.project.Projectk.Service;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.Projectk.Dto.Formrequest;
import com.project.Projectk.Entity.FormModel;
import com.project.Projectk.Entity.FormskillEntity;
import com.project.Projectk.Entity.SkillsModel;
import com.project.Projectk.Repository.FormRepository;
import com.project.Projectk.Repository.Skillsrepository;
import com.project.Projectk.Repository.formskillrepository;


@Service
public class FormService {
	@Autowired
	private FormRepository formrepo;
	@Autowired
	private Skillsrepository skillsrepo;
	@Autowired
	private formskillrepository fsrepo;
	
	public FormModel createuserform( FormModel model) {
		
		   FormModel modelform=formrepo.save(model);
		   Set<FormskillEntity> fsskills=new HashSet<FormskillEntity>();
		  for(FormskillEntity fe:model.getSkills()) {
			  fsskills.add(fe);
		  }
		    createComment(model,fsskills);
		   return  modelform;
	}
	
	public FormskillEntity createComment(FormModel model,Set<FormskillEntity> setskill) {
	
		FormskillEntity fe=new FormskillEntity();
		fe.setSelectedskill(setskill);
		fe.setFormmodel(model);
		
		return fe;
		
		
		
		         
	}
	
	public List<SkillsModel> getskills() {
		List<SkillsModel> getskills=new ArrayList<>();
		
		getskills=skillsrepo.findAll();
		for(SkillsModel model :getskills) {
			System.out.println(model.getSkillid() + model.getSkillname());
		}
		return getskills;
	}
     
	
	
	public List<FormModel> getformdata() {
		 List<FormModel> formlist= formrepo.findAll();
		 System.out.println(formlist);
		return formlist;
	}

	
	


}
