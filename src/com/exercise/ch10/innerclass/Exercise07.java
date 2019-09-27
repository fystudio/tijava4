package com.exercise.ch10.innerclass;
/**
 * Exercise 7:(2) Create a class with a private field and a private method. Create an
 * inner class with a method that modifies the outer-class field and calls the outer-class method.
 * In a second outer-class method, create an object of the inner class and call its method, then
 * show the effect on the outer-class object.
 */

import static net.mindview.util.Print.print;

class Out {
	private String outstring = "abc";

	private void take() {
		print("take");
		print(outstring);
	}

	public void calling() {
		Inn in = new Inn();
		in.modify();

	}

	class Inn {
		void modify() {
			outstring = "edf";
			take();
		}
	}
}

public class Exercise07 {

	public static void main(String[] args) {
		Out12 o = new Out12();
		o.calling();
	}

}
//take
//edf