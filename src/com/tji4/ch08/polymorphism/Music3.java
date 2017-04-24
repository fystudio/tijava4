//: polymorphism/music3/Music3.java
// An extensible program.
package com.tji4.ch08.polymorphism;

import static net.mindview.util.Print.*;

class Instrument3 {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		print("Adjusting Instrument");
	}
}

class Wind3 extends Instrument3 {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		print("Adjusting Wind");
	}
}

class Percussion3 extends Instrument3 {
	void play(Note n) {
		print("Percussion.play() " + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		print("Adjusting Percussion");
	}
}

class Stringed3 extends Instrument3 {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		print("Adjusting Stringed");
	}
}

class Brass3 extends Wind3 {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}
}

class Woodwind3 extends Wind3 {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}

public class Music3 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument3 i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument3[] e) {
		for (Instrument3 i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument3[] orchestra = { new Wind3(), new Percussion3(), new Stringed3(), new Brass3(), new Woodwind3() };
		tuneAll(orchestra);
	}
} /*
	 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
	 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
	 */// :~
