package com.exercise.ch09.interfaces;

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

}

class Dice implements Game {

	@Override
	public void drop() {
		print("drop dice");

	}

}

class CoinFactory implements GameFactory {

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Coin();
	}

}

class DiceFactory implements GameFactory {

	@Override
	public Game getGame() {
		// TODO Auto-generated method stub
		return new Dice();
	}

}

public class Exe19 {

	 static void gameConsumer(GameFactory gf){
		 Game g = gf.getGame();
		 g.drop();
		 
	 }
	public static void main(String[] args) {
		gameConsumer(new CoinFactory());
		gameConsumer(new DiceFactory());

	}

}
