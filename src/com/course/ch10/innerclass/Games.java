package com.course.ch10.innerclass;

//: interfaces/Games.java
// A Game framework using Factory Methods.
import static net.mindview.util.Print.*;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	public boolean move() {
		print("Checkers move " + moves);
		return ++moves != MOVES;
	}
	

	static GameFactory factory() {
		return new GameFactory() {

			@Override
			public Game getGame() {
				// TODO Auto-generated method stub
				return new Checkers();
			}

		};
	}
}


class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	public boolean move() {
		print("Chess move " + moves);
		return ++moves != MOVES;
	}

	static GameFactory factory() {
		return new GameFactory() {

			@Override
			public Game getGame() {
				// TODO Auto-generated method stub
				return new Chess();
			}

		};
	}
}



public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public static void main(String[] args) {
		playGame(Checkers.factory());
		playGame(Chess.factory());
	}
} /*
	 * Output: Checkers move 0 Checkers move 1 Checkers move 2 Chess move 0
	 * Chess move 1 Chess move 2 Chess move 3
	 */// :~
