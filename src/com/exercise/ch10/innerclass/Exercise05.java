package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;
/*Exercise 5:(1) Create a class with an inner class. In a separate class, make an instance of
the inner class.
* */
public class Exercise05 {

	class Inner {
		public Inner() {
			print("Inner");
		}
	}

	public static void main(String[] args) {

		Exercise05 exe = new Exercise05();
		//.new
		Exercise05.Inner in = exe.new Inner();

	}

}
