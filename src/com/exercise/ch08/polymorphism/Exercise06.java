package com.exercise.ch08.polymorphism;

import com.course.ch08.polymorphism.Note;
import static net.mindview.util.Print.print;
//Change Music3.java so that what() becomes the root Object method toString
class Instrument3 {
    void play(Note n) {
        print("Instrument.play() " + n);
    }

    String what() {
        print("Instrument3.what()");
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
    String what() {print("Wind3.what()");return "Wind3";}
    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussion3 extends Instrument3 {
    void play(Note n) {
        print("Percussion.play() " + n);
    }

	String what() {
       print("Percussion3.what()");
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
        print("Stringed3.what()");
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
    String what(){
        print("Brass3.what()");
        return "Brass3";
    }
    void adjust() {
        print("Adjusting Brass");
    }

}

class Woodwind3 extends Wind3 {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    String what() {print("WoodWind3.what()");return "WoodWind3";}

}
public class Exercise06 {

    public static void tune(Instrument3 i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument3[] e) {
        for (Instrument3 i : e)
            tune(i);
    }

    public static void printAll(Instrument3[] i){
        for(Instrument3 t:i){
            t.what();
        }
    }
    public static void main(String[] args) {
        Instrument3[] orchestra = { new Wind3(), new Percussion3(), new Stringed3(), new Brass3(), new Woodwind3() };
        //tuneAll(orchestra);
        printAll(orchestra);
    }
}
/*
Wind3.what()
Percussion3.what()
Stringed3.what()
Brass3.what()
WoodWind3.what()
* */