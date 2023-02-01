package com.mongo.app.controller;

public class Patient {
	String name;
	String patId;
	String gender;
	String age;

	String disease;


	public Patient(String name, String patId, String gender, String age, String disease) {
		this.name = name;
		this.patId = patId;
		this.gender = gender;
		this.age = age;
		this.disease = disease;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatId() {
		return patId;
	}

	public void setPatId(String patId) {
		this.patId = patId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}




}
