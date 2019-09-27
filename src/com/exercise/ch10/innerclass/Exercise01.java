package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.*;
/*(1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner. In main( ), create and
initialize a reference to an Inner.
* */
class Outer {
	class Inner {

		public Inner() {
			print("new Inner");
		}

		public void printInner() {
			print("Print Inner");
		}
	}

	Inner getInner() {
		return new Inner();
	}
}

public class Exercise01 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inner = out.getInner();
		inner.printInner();
	}

}
