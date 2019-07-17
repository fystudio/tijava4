package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

public class Exercise1 {
	String s1;

	static String s2;

	Exercise1() {
		print(s1);
		print(s2);
	}

	public static void main(String args[]) {
		new Exercise1();

	}
}
