package com.javacourse.oops2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person{
	private String tittle;
	private String employeeName;
	private char employeeGrade;
	private BigDecimal salary;
	//Operations
	
	public Employee (String name, String tittle) {
		super (name);
		this.tittle = tittle;
		System.out.println("Employee constructor");
	}
	
	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String toString() {
		//Asi se imprime mostrando desde la super class el to string realizado
		return super.toString() + '#' + tittle + '#' + employeeGrade + '#' + salary;
	}
	
}
