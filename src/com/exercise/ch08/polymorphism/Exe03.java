package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.print;

class Shape1 {
	public void draw() {
		print("shape.draw()");
	}

	public void erase() {
		print("shape.draw()");
	}
}

class Cycle1 extends Shape1 {
	// @Override
	// public void draw(){
	// print("Cycle.draw()");
	// }
}

class Triangle1 extends Shape1 {
	@Override
	public void draw() {
		print("Tringle.draw()");
	}
}

class Square1 extends Shape1 {
	// @Override
	// public void draw(){
	// print("Square.draw()");
	// }
}

public class Exe03 {

	public static void main(String[] args) {

		Shape1 c = new Cycle1();
		c.draw();

		Shape1 t = new Triangle1();
		t.draw();

		Shape1 s = new Square1();
		s.draw();

	}

}
// override all
// Cycle.draw()
// Tringle.draw()
// Square.draw()

// not override all
// shape.draw()
// shape.draw()
// shape.draw()

// override Triangle
// shape.draw()
// Tringle.draw()
// shape.draw()