package com.project.Projectk.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="skills")
public class SkillsModel {
	@Id
	@Column(name="skill_id")
	private Integer skillid;
	
	@Column(name="skill_name")
	private String skillname;
	
	public SkillsModel() {}
	
	
	public SkillsModel(int skillid, String skillname) {
		super();
		this.skillid = skillid;
		this.skillname = skillname;
	}
	
	
	
	

	
	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}
	public int getSkillid() {
		return skillid;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	
	
	
}
