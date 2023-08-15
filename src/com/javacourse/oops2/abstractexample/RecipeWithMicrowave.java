package com.javacourse.oops2.abstractexample;

public class RecipeWithMicrowave extends AbstractRecipe{

	
	
	//Metodos que se sobreescriben en las clases 
	//Aqui se les da su funcionalidad propia
	@Override
	void getReady() {
		// TODO Auto-generated method stub
		super.getReady();
		System.out.println("Hola este es otro metodo sobreescrito");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Mundo las super clase hereda a todas las demas");
		super.doTheDish();
	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo de para que puede servir una clase abstracta");
		super.cleanUp();
	}
	
}
