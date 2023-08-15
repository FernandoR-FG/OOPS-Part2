package com.javacourse.oops2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();
		
		//Esto de las interfaces es lo que llamamos polimorfismo
		//los metodos toman la forma del juego que se necesita
		//se implementa diferente de acuerdoa a la necesidad
		System.out.println("\n\nProbamos el juego chess");
		ChessGame game1 = new ChessGame();
		game1.up();
		game1.down();
		game1.left();
		game1.right();
		System.out.println("\n\nProbamos otra forma de imprimir");
		//Otra forma de imprirmir es la siguiente
		GamingConsole[] games = {new MarioGame(),new ChessGame()};
		for(GamingConsole gamex:games) {
			gamex.up();
			gamex.down();
			gamex.left();
			gamex.right();
		}
	}

}
