package com.exercise.ch09.interfaces;

import static net.mindview.util.Print.print;

abstract class Rodent {
	public abstract void bite();// {
	// print("Rodent.bite");
	// }

	public abstract void dig();// {
	// print("Rodent.dig");
	// }

}

class Mouse extends Rodent {

	public void bite() {
		print("Mouse.bite");
	}

	public void dig() {
		print("Mouse.dig");
	}

	public void eat() {
		print("Mouse.eat");
	}
}

class Gerbil extends Rodent {
	public void bite() {
		print("Gerbil.bite");
	}

	public void dig() {
		print("Gerbil.dig");
	}

	public void run() {
		print("Gerbil.run");
	}
}

class Hamster extends Rodent {
	public void bite() {
		print("Hamster.bite");
	}

	public void dig() {
		print("Hamster.dig");
	}

	public void roll() {
		print("Hamster.roll");
	}
}

public class Exe01 {

	public static void printAll(Rodent[] rods) {

		for (Rodent r : rods) {
			r.bite();
			r.dig();
		}
	}

	public static void printOwn(Rodent[] rods) {

	}

	public static void main(String[] args) {
		Rodent[] rodents = { new Hamster(), new Gerbil(),
				new Mouse()/* , new Rodent() */ };
		printAll(rodents);

	}

}
