package com.javacourse.oops2.interfaces;

public class ChessGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Vamos arriba chess");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Vamos abajo chess");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Vamos izquierda chess");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Vamos derecha chess");
	}

}
