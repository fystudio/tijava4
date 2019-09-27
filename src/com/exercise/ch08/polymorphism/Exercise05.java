package com.exercise.ch08.polymorphism;

import com.course.ch08.polymorphism.Wheel;

/*
 * Starting from Exercise 1, add a wheels() method in Cycle, which returns the
 * number of wheels. Modify ride() to call wheels() and verify that polymorphism works
 * */
class Cycle2 {
	public void ride(Wheel w) {
		System.out.println("Cycle.ride:" + wheel(w));

	}

	public int wheel(Wheel w) {
		int i = 0;
		switch (w) {
		case ONE_WHEEL:
			i = 1;
			break;
		case TWO_WHEELS:
			i = 2;
			break;
		case THREE_WHEELS:
			i = 3;
			break;
		}
		return i;
	}
}

class Unicycle2 extends Cycle2 {
	public void ride(Wheel w) {
		System.out.println("Unicycle.ride:" + wheel(w));

	}

}

class Bicycle2 extends Cycle2 {
	public void ride(Wheel w) {
		System.out.println("Bicycle.ride:" + wheel(w));

	}

}

class Tricycle2 extends Cycle2 {
	public void ride(Wheel w) {
		System.out.println("Tricycle.ride:" + wheel(w));

	}

}

public class Exercise05 {

	public static void main(String[] args) {
		Cycle2 u = new Unicycle2();
		u.ride(Wheel.ONE_WHEEL);

		Cycle2 b = new Bicycle2();
		b.ride(Wheel.TWO_WHEELS);

		Cycle2 t = new Tricycle2();
		t.ride(Wheel.THREE_WHEELS);

	}

}
