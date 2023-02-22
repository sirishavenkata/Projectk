package com.project.Projectk.Entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class FormskillEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String selectedskillname;
	
	@ManyToOne
	@JoinColumn(name="formid")
	private FormModel formmodel;
	
	
	

	public FormModel getFormmodel() {
		return formmodel;
	}
	public void setFormmodel(FormModel formmodel) {
		this.formmodel = formmodel;
	}
	public FormskillEntity(Long id, String selectedskill) {
		super();
		this.id = id;
		this.selectedskillname = selectedskill;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@JsonCreator
	public FormskillEntity(Long id, String selectedskillname,@JsonProperty() FormModel formmodel) {
		super();
		this.id = id;
		this.selectedskillname = selectedskillname;
		this.formmodel = formmodel;
	}
	public String getSelectedskill() {
		return selectedskillname;
	}
	public void setSelectedskill(String set) {
		this.selectedskillname = set;
	}
	
	

}
