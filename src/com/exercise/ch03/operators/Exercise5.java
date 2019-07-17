package com.exercise.ch03.operators;

import static net.mindview.util.Print.print;

class Dog {
	String name;
	String says;

}
//exercise 5 and 6
public class Exercise5 {

	public static void main(String args[]) {

		Dog d1 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";
		Dog d2 = new Dog();
		d2.name = "scruffy";
		d2.says = "Wurf!";

		print("d1's name: " + d1.name + "\n" + "d1 syas:" + d1.says);
		print("d2's name: " + d2.name + "\n" + "d2 syas:" + d2.says);



	}
}
