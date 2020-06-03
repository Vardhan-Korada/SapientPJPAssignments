package com.sapient.student;

public class Student {
	public Student(String name, String id, String dob, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.branch = branch;
	}
	public Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.dob = s.dob;
		this.branch = s.branch;
	}
	public Student() {
		super();
	}
	private String name;
	private String id;
	private String dob;
	private String branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student-Name: " + name + ",Id: " + id + ",DOB: " + dob + ",Branch: " + branch;
	}
}
