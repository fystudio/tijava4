package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.print;

import com.course.ch08.polymorphism.Note;

class Instrument4 {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	void adjust() {
		print("Adjusting Instrument");
	}

	public String what() {
		print("print Instrument");
		return "Instrument";
	}
}

class Wind4 extends Instrument4 {
	void play(Note n) {
		print("Wind.play() " + n);
	}
	void adjust() {
		print("Adjusting Wind");
	}

	public String what() {
		print("print Wind");
		return "Wind";
	}
}

class Percussion4 extends Instrument4 {
	void play(Note n) {
		print("Percussion.play() " + n);
	}
	void adjust() {
		print("Adjusting Percussion");
	}

	public String what() {
		print("print Percussion");
		return "Percussion";
	}
}

class Stringed4 extends Instrument4 {
	void play(Note n) {
		print("Stringed.play() " + n);
	}
	void adjust() {
		print("Adjusting Stringed");
	}

	public String what() {
		print("print Stringed");
		return "Stringed";
	}
}

class Brass4 extends Wind4 {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}

	public String what() {
		print("print Brass");
		return "Brass";
	}
}

class Woodwind4 extends Wind4 {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}
	public String what() {
		print("print Woodwind");
		return "Woodwind";
	}
}
class Piano extends Instrument4 {
	void play(Note n) {
		print("Piano.play()" + n);
	}

	public String what() {
		print("print Piano");
		return "Piano";
	}

}

public class Exercise07 {

	public static void tune(Instrument4 i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument4[] e) {
		for (Instrument4 i : e)
			tune(i);
	}

	public static void printAll(Instrument4[] i) {
		for (Instrument4 t : i) {
			t.what();
		}
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument4[] orchestra = { new Wind4(), new Percussion4(), new Stringed4(), new Brass4(), new Woodwind4() , new Piano()};
		// tuneAll(orchestra);
		printAll(orchestra);

	}

}

//print Wind
//print Percussion
//print Stringed
//print Brass
//print Woodwind
//print Piano