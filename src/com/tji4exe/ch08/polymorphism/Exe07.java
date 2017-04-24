package com.tji4exe.ch08.polymorphism;

import static net.mindview.util.Print.print;

import com.tji4.ch08.polymorphism.Note;

class Instrument4 {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	void adjust() {
		print("Adjusting Instrument");
	}

	public String toString() {
		print("print Instrument");
		return "Instrument";
	}
}

class Wind4 extends Instrument4 {
	void play(Note n) {
		print("Wind.play() " + n);
	}

	// String what() {
	// return "Wind";
	// }

	void adjust() {
		print("Adjusting Wind");
	}

	public String toString() {
		print("print Wind");
		return "Wind";
	}
}

class Percussion4 extends Instrument4 {
	void play(Note n) {
		print("Percussion.play() " + n);
	}

	// String what() {
	// return "Percussion";
	// }

	void adjust() {
		print("Adjusting Percussion");
	}

	public String toString() {
		print("print Percussion");
		return "Percussion";
	}
}

class Stringed4 extends Instrument4 {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

	// String what() {
	// return "Stringed";
	// }

	void adjust() {
		print("Adjusting Stringed");
	}

	public String toString() {
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

	public String toString() {
		print("print Brass");
		return "Brass";
	}
}

class Woodwind4 extends Wind4 {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

	// String what() {
	// return "Woodwind";
	// }

	public String toString() {
		print("print Woodwind");
		return "Woodwind";
	}
}

class Piano extends Instrument4 {
	void play(Note n) {
		print("Piano.play()" + n);
	}

	public String toString() {
		print("print Piano");
		return "Piano";
	}

}

public class Exe07 {

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
			t.toString();
		}
	}

	public Exe07() {
		// TODO Auto-generated constructor stub
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