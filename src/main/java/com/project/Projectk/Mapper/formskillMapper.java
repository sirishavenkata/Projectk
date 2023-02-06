package com.project.Projectk.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.project.Projectk.DTO.FormGetdto;
import com.project.Projectk.DTO.FormPostDTO;
import com.project.Projectk.DTO.Skillsgetdto;
import com.project.Projectk.Entity.FormModel;
import com.project.Projectk.Entity.SkillsModel;

@Mapper(componentModel = "spring")
public interface formskillMapper {
	
	FormGetdto formtogetform(FormModel form);
	
	FormPostDTO formtoPostform(FormModel postform);
	
	Skillsgetdto skilltogetskills(SkillsModel skills);
	
	List<Skillsgetdto> listofskills(List<SkillsModel> skilllist);
	
	FormModel  formmodeltodto(FormPostDTO postform);

}
