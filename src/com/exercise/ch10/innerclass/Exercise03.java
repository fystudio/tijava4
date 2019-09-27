package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;
/*Exercise 3:(1) Modify Exercise 1 so that Outer has a private String field (initialized
by the constructor), and Inner has a toString( ) that displays this field. Create an object of
type Inner and display it.
* */
//Question: why not call toString automatically ?
class Outer1 {
	private String name = "Outer1";

	class Inner1 {

		public Inner1() {
			//print("new Inner");
		}

		public void printInner() {
			//print("Print Inner");
		}

		public String toString() {
			print("Print Inner toString()");
			return name;
		}
	}

	Inner1 getInner() {
		return new Inner1();
	}
}

public class Exercise03 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner1 inner = out.getInner();
		//inner.toString();

	}

}
