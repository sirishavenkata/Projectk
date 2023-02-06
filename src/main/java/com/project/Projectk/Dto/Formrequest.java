package com.project.Projectk.Dto;

import java.util.Objects;

import com.project.Projectk.Entity.FormModel;

public class Formrequest {
	
	private FormModel model;

	public FormModel getModel() {
		return model;
	}

	public void setModel(FormModel model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Formrequest [model=" + model + ", getModel()=" + getModel() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Formrequest(FormModel model) {
		super();
		this.model = model;
	}
	
	public Formrequest() {}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formrequest other = (Formrequest) obj;
		return Objects.equals(model, other.model);
	}
	

}
