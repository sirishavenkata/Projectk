package com.project.Projectk.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.Projectk.Entity.SkillsEntity;
import com.project.Projectk.Entity.SkillsModel;

@Repository
public interface Skillsrepository  extends JpaRepository<SkillsModel, Integer>{
	
	

}
