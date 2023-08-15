package com.javacourse.oops2.abstractexample;

public class Recipe1 extends AbstractRecipe{

	
	
	//Metodos que se sobreescriben en las clases 
	//Aqui se les da su funcionalidad propia
	@Override
	void getReady() {
		// TODO Auto-generated method stub
		super.getReady();
		System.out.println("Hola");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Mundo");
		super.doTheDish();
	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo");
		super.cleanUp();
	}
	
}
