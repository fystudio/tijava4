package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;
/*Exercise 15:
(2) Create a class with a non-default constructor (one with arguments) and
no default constructor (no "no-arg" constructor). Create a second class that has a method
that returns a reference to an object of the first class. Create the object that you return by
making an anonymous inner class that inherits from the first class
* */
class OExe15 {
	public OExe15(int i) {
		print("i:" + i);
	}
}

public class Exercise15 {

	OExe15 getO(int i) {
		return new OExe15(i) {
		};
	}

	public static void main(String[] args) {
		Exercise15 e15= new Exercise15();
		e15.getO(15);

	}

}
