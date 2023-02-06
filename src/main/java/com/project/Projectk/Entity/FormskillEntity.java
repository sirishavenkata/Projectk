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

@Entity
public class FormskillEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	@ElementCollection(targetClass=String.class)
	private Set<FormskillEntity> selectedskillname;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "formid", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private FormModel formmodel;
	public FormskillEntity() {};
	
	public FormModel getFormmodel() {
		return formmodel;
	}

	public void setFormmodel(FormModel formmodel) {
		this.formmodel = formmodel;
	}

	public FormskillEntity(int id, Set<FormskillEntity> selectedskill) {
		super();
		this.id = id;
		this.selectedskillname = selectedskill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<FormskillEntity> getSelectedskill() {
		return selectedskillname;
	}
	public void setSelectedskill(Set<FormskillEntity> set) {
		this.selectedskillname = set;
	}
	
	

}
