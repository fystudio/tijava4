package com.tji4.ch09.interfaces;

import com.tji4.ch08.polymorphism.Note;
import static net.mindview.util.Print.print;

interface Instrument5 {
	int VALUE = 5; // COMPILE TIME CONSTANT
	// Can't have method definitions

	void play(Note n);

	void adjust();
}

class Wind5 implements Instrument5 {

	@Override
	public void play(Note n) {
		print(this + ".play()" + n);

	}

	@Override
	public void adjust() {
		print(this + ".adjust()");

	}

	public String toString() {
		return "Wind";
	}
}

class Percussion5 implements Instrument5 {

	@Override
	public void adjust() {
		print(this + ".adjust()");

	}

	@Override
	public void play(Note n) {
		print(this + ".play()" + n);

	}

	public String toString() {
		return "Percussion";
	}
}

class Stringed5 implements Instrument5 {

	@Override
	public void play(Note n) {
		print(this + ".play()" + n);

	}

	@Override
	public void adjust() {
		print(this + ".adjust()");

	}

	public String toString() {
		return "Stringed";
	}

}

class Brass5 extends Wind5 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind5 extends Wind5 {
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	// Doesn't care about type, so new types
	// added to the system still work right
	static void tune(Instrument5 i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument5[] e) {
		for (Instrument5 i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		Instrument5[] orchestra = { new Wind5(), new Percussion5(), new Stringed5(), new Brass5(), new Woodwind5() };
		tuneAll(orchestra);
	}

}


//Wind.play()MIDDLE_C
//Percussion.play()MIDDLE_C
//Stringed.play()MIDDLE_C
//Brass.play()MIDDLE_C
//Woodwind.play()MIDDLE_C