package com.exercise.ch08.polymorphism;
/*
 * 修改Music3，使得what 方法成为toString方法
 * */
import static net.mindview.util.Print.print;

import com.course.ch08.polymorphism.Note;


class Instrument3 {
	void play(Note n) {
		print("Instrument.play() " + n);
	}

	

	void adjust() {
		print("Adjusting Instrument");
	}
	
	public String toString(){
		print("print Instrument");
		return "Instrument";
	}
}

class Wind3 extends Instrument4 {
	void play(Note n) {
		print("Wind.play() " + n);
	}

//	String what() {
//		return "Wind";
//	}

	void adjust() {
		print("Adjusting Wind");
	}
	
	public String toString(){
		print("print Wind");
		return "Wind";
	}
}

class Percussion3 extends Instrument4 {
	void play(Note n) {
		print("Percussion.play() " + n);
	}

//	String what() {
//		return "Percussion";
//	}

	void adjust() {
		print("Adjusting Percussion");
	}
	
	public String toString(){
		print("print Percussion");
		return "Percussion";
	}
}

class Stringed3 extends Instrument4 {
	void play(Note n) {
		print("Stringed.play() " + n);
	}

//	String what() {
//		return "Stringed";
//	}

	void adjust() {
		print("Adjusting Stringed");
	}
	
	public String toString(){
		print("print Stringed");
		return "Stringed";
	}
}

class Brass3 extends Wind3 {
	void play(Note n) {
		print("Brass.play() " + n);
	}

	void adjust() {
		print("Adjusting Brass");
	}
	
	public String toString(){
		print("print Brass");
		return "Brass";
	}
}

class Woodwind3 extends Wind3 {
	void play(Note n) {
		print("Woodwind.play() " + n);
	}

//	String what() {
//		return "Woodwind";
//	}
	
	public String toString(){
		print("print Woodwind");
		return "Woodwind";
	}
}

public class Exe06 {

	public static void tune(Instrument4 i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument4[] e) {
		for (Instrument4 i : e)
			tune(i);
	}
	
	public static void printAll(Instrument4[] i){
		for(Instrument4 t:i){
			t.toString();
		}
	}public Exe06() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument4[] orchestra = { new Wind3(), new Percussion3(), new Stringed3(), new Brass3(), new Woodwind3() };
		//tuneAll(orchestra);
		printAll(orchestra);
		
	}

}

//print Wind
//print Percussion
//print Stringed
//print Brass
//print Woodwind
