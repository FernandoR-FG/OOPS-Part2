package com.javacourse.oops2.interfaces;

public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Vamos arriba mario");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Vamos abajo mario");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Vamos izquierda mario");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Vamos derecha mario");
	}

}
