package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

interface Game {
	void drop();
}

interface GameFactory {
	Game getGame();
}

class Coin implements Game {

	@Override
	public void drop() {
		print("drop coin");

	}

	static GameFactory factory() {
		return new GameFactory() {

			@Override
			public Game getGame() {
				// TODO Auto-generated method stub
				return new Coin();
			}
		};
	}
}

class Dice implements Game {

	@Override
	public void drop() {
		print("drop dice");

	}

	static GameFactory factory() {
		return new GameFactory() {

			@Override
			public Game getGame() {
				// TODO Auto-generated method stub
				return new Dice();
			}
		};
	}
}

public class Exe17 {

	static void gameConsumer(GameFactory gf) {
		Game g = gf.getGame();
		g.drop();

	}

	public static void main(String[] args) {
		gameConsumer(Dice.factory());
		gameConsumer(Coin.factory());

	}

}
