package com.javacourse.oops2.interfaces;

public class RealAlgorithm implements ComplexAlgorithm{

	//Clase nueva que implementa la misma interfaz pero da nueva logica al metodo
	@Override
	public int complexAlgorithm(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1*number2;
	}

}
