package com.crudpratice.crud;

public class Student {
	String name;
	String course;
	int fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Student(String name, String course, int fees) {
		super();
		this.name = name;
		this.course = course;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}

}
