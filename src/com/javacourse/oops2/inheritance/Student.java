package com.javacourse.oops2.inheritance;

public class Student extends Person {
	//La palabra extends permite heredar todo lo de person
	private String college;
	private int year;
	
	public Student(String name, String collageName) {
		super(name); //Llamaos al constructor de la clase  super
		this.college = collageName;
	}
	
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
