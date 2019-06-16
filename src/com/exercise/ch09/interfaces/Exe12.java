package com.exercise.ch09.interfaces;

import static net.mindview.util.Print.print;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanClimb {
	void climb();
}

class ActionCharacter {
	public void fight() {
		print("ActionCharacter.fight");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly , CanClimb {
	public void swim() {
		print("Hero.swim");
	}

	public void fly() {
		print("Hero.fly");
	}

	@Override
	public void climb() {
		print("Hero.climb");
	}
	
	
}

public class Exe12 {
	public static void t(CanFight x) {
		x.fight();
	}

	public static void u(CanSwim x) {
		x.swim();
	}

	public static void v(CanFly x) {
		x.fly();
	}

	public static void w(ActionCharacter x) {
		x.fight();
	}

	public static void c(CanClimb x){
		x.climb();
	}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h); // Treat it as a CanFight
		u(h); // Treat it as a CanSwim
		v(h); // Treat it as a CanFly
		w(h); // Treat it as an ActionCharacter
		c(h);
	}

}
