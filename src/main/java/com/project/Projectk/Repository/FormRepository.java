package com.project.Projectk.Repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Projectk.Dto.Formrequest;
import com.project.Projectk.Entity.FormModel;
import com.project.Projectk.Entity.FormskillEntity;

@Repository
public interface FormRepository extends JpaRepository<FormModel, Long> {

	
}
