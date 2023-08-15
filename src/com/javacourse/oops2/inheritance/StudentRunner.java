package com.javacourse.oops2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(null, null);
		//Como podemos ver student tiene lo de person
		/*
		 * Person es la super clase
		 * student es la clase hija o subclase
		 * */
		student.getName();
		student.getCollege();
		
		//Todas las clases extends de Object
		Person person = new Person(null);
		person.toString();
		
	}

}
