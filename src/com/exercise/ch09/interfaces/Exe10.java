package com.exercise.ch09.interfaces;

import static net.mindview.util.Print.print;

import com.course.ch08.polymorphism.Note;

interface Instrument10 {

	void adjust();
}

interface Playable10 {
	void play(Note n);

}

class Wind10 implements Instrument10, Playable10 {

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

class Percussion10 implements Instrument10, Playable10 {

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

class Stringed10 implements Instrument10, Playable10 {

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

class Brass10 extends Wind10 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind10 extends Wind10 {
	public String toString() {
		return "Woodwind";
	}
}

class Music5 {

	// static void playAll(Playable10[] p){
	// for(Playable10 i:p){
	// i.play(Note.B_FLAT);
	// }
	// }

}

public class Exe10 {
	static void tuneAll(Instrument10[] e) {
		for (Instrument10 i : e) {
			i.adjust();
			((Playable10) i).play(Note.B_FLAT);
		}
	}

	public static void main(String[] args) {
		Instrument10[] orchestra = { new Wind10(), new Percussion10(), new Stringed10(), new Brass10(),
				new Woodwind10() };
		tuneAll(orchestra);

	}

}

//Wind.adjust()
//Wind.play()B_FLAT
//Percussion.adjust()
//Percussion.play()B_FLAT
//Stringed.adjust()
//Stringed.play()B_FLAT
//Brass.adjust()
//Brass.play()B_FLAT
//Woodwind.adjust()
//Woodwind.play()B_FLAT
