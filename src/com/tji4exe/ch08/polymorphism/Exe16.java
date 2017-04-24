package com.tji4exe.ch08.polymorphism;

import static net.mindview.util.Print.print;

class Actor {
	public void act() {
	}
}

class HappyActor extends Actor {
	public void act() {
		print("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		print("SadActor");
	}
}

class StarShip extends Actor {
	public void act() {
		print("StarShip");
	}
}

class Stage {
	private Actor actor = new HappyActor();

	public void change() {
		actor = new SadActor();
	}

	public void alertStatus() {
		actor = new StarShip();
	}

	public void performPlay() {
		actor.act();
	}
}

public class Exe16 {

	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
		stage.alertStatus();
		stage.performPlay();

	}

}
