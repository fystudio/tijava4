package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.*;

class Shared {
	private long reference = 0;

	public Shared() {
		print("Creating Shared" + addReffer());

	}

	private long addReffer() {
		return reference++;

	}

	public void dispose() {
		print("Disposing Shared" + removeReffer());
	}

	private long removeReffer() {
		return --reference;

	}
}

public class Exercise14 {

	public static void main(String[] args) {

		Shared[] shareds = { new Shared(), new Shared(), new Shared(), new Shared(), new Shared() };
		for (Shared shared : shareds) {

			shared.dispose();

		}

	}

}
