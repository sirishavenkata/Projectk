package com.project.Projectk.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Entity
@Table(name="forms")
public class FormModel  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long formid;
	private String firstName;
	private String lastName;
	private String Email;
	private long mobileNumber;
	private int overalExperience;
	private int relaventExperience;
	private Date dateOfBirth;
	private String adarNumber;
	@Column(name="name_of_college")
	private String nameOfCollege;
	private String certificates;
	
	@OneToMany(mappedBy = "formmodel",cascade= CascadeType.ALL ,orphanRemoval = true)
	private List<FormskillEntity> skills= new ArrayList<>();

	public FormModel() {}
	
	@JsonCreator
	public FormModel(Long formid, String firstName, String lastName, String email, long mobileNumber,
			int overalExperience, int relaventExperience, Date dateOfBirth, String adarNumber, String nameOfCollege,
			String certificates, @JsonProperty("skills")List<FormskillEntity> skills) {
		super();
		this.formid = formid;
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
		this.mobileNumber = mobileNumber;
		this.overalExperience = overalExperience;
		this.relaventExperience = relaventExperience;
		this.dateOfBirth = dateOfBirth;
		this.adarNumber = adarNumber;
		this.nameOfCollege = nameOfCollege;
		this.certificates = certificates;
		this.skills = skills;
	}

	public Long getFormid() {
		return formid;
	}

	public void setFormid(Long formid) {
		this.formid = formid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getOveralExperience() {
		return overalExperience;
	}

	public void setOveralExperience(int overalExperience) {
		this.overalExperience = overalExperience;
	}

	public int getRelaventExperience() {
		return relaventExperience;
	}

	public void setRelaventExperience(int relaventExperience) {
		this.relaventExperience = relaventExperience;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAdarNumber() {
		return adarNumber;
	}

	public void setAdarNumber(String adarNumber) {
		this.adarNumber = adarNumber;
	}

	public String getNameOfCollege() {
		return nameOfCollege;
	}

	public void setNameOfCollege(String nameOfCollege) {
		this.nameOfCollege = nameOfCollege;
	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}

	public List<FormskillEntity> getSkills() {
		return skills;
	}

	public void setSkills(List<FormskillEntity> skills) {
		this.skills = skills;
	}


	@Override
	public String toString() {
		return "FormModel [formid=" + formid + ", firstName=" + firstName + ", lastName=" + lastName + ", Email="
				+ Email + ", mobileNumber=" + mobileNumber + ", overalExperience=" + overalExperience
				+ ", relaventExperience=" + relaventExperience + ", dateOfBirth=" + dateOfBirth + ", adarNumber="
				+ adarNumber + ", nameOfCollege=" + nameOfCollege + ", certificates=" + certificates + ", skills="
				+ skills + ", getFormid()=" + getFormid() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + ", getMobileNumber()=" + getMobileNumber()
				+ ", getOveralExperience()=" + getOveralExperience() + ", getRelaventExperience()="
				+ getRelaventExperience() + ", getDateOfBirth()=" + getDateOfBirth() + ", getAdarNumber()="
				+ getAdarNumber() + ", getNameOfCollege()=" + getNameOfCollege() + ", getCertificates()="
				+ getCertificates() + ", getSkills()=" + getSkills() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
	

	