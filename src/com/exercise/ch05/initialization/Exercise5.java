package com.exercise.ch05.initialization;

public class Exercise5 {

	public void bark(String s) {
		System.out.println("barking");
	}

	public void bark(int i) {
		System.out.println("howling");
	}

	public void bark(String a, int b) {
		System.out.println("a and b");
	};

	public void bark(int b, String a) {
		System.out.println("b and a");
	}

	public static void main(String args[]) {
		Exercise5 dog = new Exercise5();

		dog.bark("barking");
		dog.bark(5);
		dog.bark(1, "a");
		dog.bark("a", 1);
	}
}
