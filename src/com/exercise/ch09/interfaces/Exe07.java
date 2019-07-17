package com.exercise.ch09.interfaces;

import static net.mindview.util.Print.print;

interface Rodent7 {
	void bite();

	void dig();

}

class Mouse7 implements Rodent7 {

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

class Gerbil7 implements Rodent7 {
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

class Hamster7 implements Rodent7 {
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

public class Exe07 {

	public static void printAll(Rodent7[] rods) {

		for (Rodent7 r : rods) {
			r.bite();
			r.dig();
		}
	}

	public static void main(String[] args) {
		Rodent7[] rodents = { new Hamster7(), new Gerbil7(), new Mouse7() };
		printAll(rodents);

	}
}
