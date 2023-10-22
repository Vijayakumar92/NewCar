package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private int modelNo;
	private String modelName;
	
	public Car() {}

	public Car(int modelNo, String modelName) {
		super();
		this.modelNo = modelNo;
		this.modelName = modelName;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", modelName=" + modelName + "]";
	}
	
	

}
