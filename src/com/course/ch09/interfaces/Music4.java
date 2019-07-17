package com.course.ch09.interfaces;

import static net.mindview.util.Print.print;

import com.course.ch08.polymorphism.Note;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		print("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass extends Wind {
	public void play(Note n) {
		print("Brass.play() " + n);
	}

	public void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}

	public String what() {
		return "Woodwind";
	}
}

public class Music4 {

	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}
