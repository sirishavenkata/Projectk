package com.project.Projectk.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.Projectk.Entity.FormskillEntity;
import com.project.Projectk.Entity.SkillsModel;

@Repository
public interface formskillrepository  extends JpaRepository<FormskillEntity, Integer>{
	
	

}
