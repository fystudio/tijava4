package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.print;

import java.util.Random;

import com.course.ch08.polymorphism.Note;

class Instrument5 {
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

class Wind5 extends Instrument5 {
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

class Percussion5 extends Instrument5 {
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

class Stringed5 extends Instrument5 {
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

class Brass5 extends Wind5 {
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

class Woodwind5 extends Wind5 {
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

// Random generator

class RandomInstrumentGenerator {
	private Random random = new Random(19);

	public Instrument5 next() {
		Instrument5 inst = null;

		switch (random.nextInt(3)) {

		case 0:
			inst = new Wind5();
			break;
		case 1:
			inst = new Woodwind5();
			break;
		case 2:
			inst = new Brass5();
			break;
		case 3:
			inst = new Stringed5();
			break;
		case 4:
			inst = new Percussion5();
			break;
		default:
			inst = new Instrument5();

		}
		return inst;

	}

}

public class Exe08 {

	public static void tune(Instrument5 i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument5[] e) {
		for (Instrument5 i : e)
			tune(i);
	}

	public static void printAll(Instrument5[] i) {
		for (Instrument5 t : i) {
			t.toString();
		}
	}
	
	public static void printOne(Instrument5 i){
		i.toString();
	}

	public Exe08() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument5[] orchestra = { new Wind5(), new Percussion5(), new Stringed5(), new Brass5(), new Woodwind5() };
		// tuneAll(orchestra);
	//	printAll(orchestra);
		
		RandomInstrumentGenerator randomInstr = new RandomInstrumentGenerator();
		
		
		for (int i=0;i<orchestra.length;i++){
			printOne(randomInstr.next());
		}

	}

}
