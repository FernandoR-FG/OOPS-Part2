package com.javacourse.oops2.interfacesexercises;

public class FlyingObjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable flyingObjects = new BirdFly();
		flyingObjects.fly();
		
		Flyable flyingObjects1 = new AeroplaneFly();
		flyingObjects1.fly();
		
		System.out.println("\n\nUtilizando otra forma para imprimir los objetos dentro");
		//Una manera de loop todos los objetos es la siguiente
		Flyable[] flyingOb = {new BirdFly(),new AeroplaneFly()};
		for(Flyable object: flyingOb) {
			object.fly();
		}
	}

}
