package com.javacourse.oops2.abstractexample;

public abstract class AbstractRecipe {
	//Tipico uso de una clase abstracta
	//Las clases abstractas no se pueden instanciar
	//Todas las acciones que tiene se heredan a las demas
	public void execute() {
		
		getReady();
		doTheDish();
		cleanUp();
	}
	
	//Metodos que van a ser sobreescritos en las subclases
	void getReady() {
	}
	void doTheDish() {
	}
	void cleanUp() {
	}
	
}
