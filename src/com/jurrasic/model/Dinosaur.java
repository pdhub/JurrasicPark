package com.jurrasic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "DinosaurLocation")
public class Dinosaur {

	@Id
	@Column(name = "dinosaurId", unique = true, nullable = false)
	private int dinosaurId;
	private String dinosaurName;
	private String dinousaurType;
	private String dinosaurPlace;
	private String dinosaurLocation;
	
	public int getDinosaurId() {
		return dinosaurId;
	}
	public void setDinosaurId(int dinosaurId) {
		this.dinosaurId = dinosaurId;
	}
	public String getDinosaurName() {
		return dinosaurName;
	}
	public void setDinosaurName(String dinosaurName) {
		this.dinosaurName = dinosaurName;
	}
	public String getDinousaurType() {
		return dinousaurType;
	}
	public void setDinousaurType(String dinousaurType) {
		this.dinousaurType = dinousaurType;
	}
	public String getDinosaurPlace() {
		return dinosaurPlace;
	}
	public void setDinosaurPlace(String dinosaurPlace) {
		this.dinosaurPlace = dinosaurPlace;
	}
	public String getDinosaurLocation() {
		return dinosaurLocation;
	}
	public void setDinosaurLocation(String dinosaurLocation) {
		this.dinosaurLocation = dinosaurLocation;
	}
}
