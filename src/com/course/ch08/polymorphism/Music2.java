package com.course.ch08.polymorphism;
class Instrument1 {
	public void play(Note n){
		System.out.println("Instrument.play()");
	}
}

class Wind1 extends Instrument{
	public void play(Note n){
		System.out.println("Wind.play()");
	} 
}

class Stringed extends Instrument{
	public void play(Note n){
		System.out.println("String.play()");
	} 
}

class Brass extends Instrument{
	public void play(Note n){
		System.out.println("Brass.play()");
	} 
}
public class Music2 {
	public static void tune(Wind i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Stringed i){
		i.play(Note.C_SHARP);
	}
	
	public static void tune(Brass i){
		i.play(Note.B_FLAT);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);

	}
}
//Wind.play()
//String.play()
//Brass.play()