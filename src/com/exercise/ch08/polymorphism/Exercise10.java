package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.print;

class Base {
	public void play() {

		print("Base.play");
		tune();

	}

	public void tune() {
		print("Base.tune");

	}
}

class Child extends Base {
	
//	public void play(){
//		print("Child.play");
//	}
	
	public void tune(){
		print("Child.tune");
	}

}

public class Exe10 {

	public static void main(String[] args) {
		Base ch = new Child();
		ch.play();
	}

}

//Base.play
//Child.tune