package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.print;

class Meal1 {
	Meal1() {
		print("Meal()");
	}
}

class Bread1 {
	Bread1() {
		print("Bread()");
	}
}

class Cheese1 {
	Cheese1() {
		print("Cheese()");
	}
}

class Lettuce1 {
	Lettuce1() {
		print("Lettuce()");
	}
}

class Pickle1 {
	Pickle1(){
		print("Pickle()");
	}
}
class Lunch1 extends Meal1 {
	Lunch1() {
		print("Lunch()");
	}
}

class PortableLunch1 extends Lunch1 {
	PortableLunch1() {
		print("PortableLunch()");
	}
}

class Sandwich extends PortableLunch1 {
	private Bread1 b = new Bread1();
	private Cheese1 c = new Cheese1();
	private Lettuce1 l = new Lettuce1();
	private Pickle1 p = new Pickle1();

	public Sandwich() {
		print("Sandwich()");
	}

} /*
	 * Output: Meal() Lunch() PortableLunch() Bread() Cheese() Lettuce()
	 * Sandwich()
	 */// :~

public class Exercise11 {

	public static void main(String[] args) {
		new Sandwich();
	}

}
