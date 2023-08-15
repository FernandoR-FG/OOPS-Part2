package com.javacourse.oops2.interfaces;

public class Project {

	//Algo curiosos que pasa con las interfaces es que si falla una todas se caen
	//para evitar esto se usa default que provee una implementacion por defecto
	//de los metodos aqui un ejemplo
	
	//Interface
	interface Test {
		void nada();
		default void nadaMas() {
		//Para esto se usa default que busca dar una implementacion standar	
		}
	}
	
	//Dos clases implementan Test
	//pimero solo tiene un metodo pero si se crea otro en Test
	//Las demas fallan
	class Class1 implements Test{

		@Override
		public void nada() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Class2 implements Test{

		@Override
		public void nada() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo una instancia de la interfaz y es igual a la clase que 
		//la implementa
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 20));
		//Probando la otra clase que implementa la interfaz
		ComplexAlgorithm algorithm1 = new RealAlgorithm(); //Es new claseQueImplementaLaInterfaz
		System.out.println(algorithm1.complexAlgorithm(10, 20));
	}

}
