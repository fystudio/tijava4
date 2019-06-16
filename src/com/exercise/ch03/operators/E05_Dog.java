package com.exercise.ch03.operators;

class Dog {
	String name;
	String says;

}

public class E05_Dog {

	public static void main(String args[]) {

		Dog d1 = new Dog();
		d1.name = "spot";
		d1.says = "Ruff!";
		Dog d2 = new Dog();
		d2.name = "scruffy";
		d2.says = "Wurf!";

		System.out.println("d1's name: " + d1.name + "\n" + "d1 syas:" + d1.says);
		System.out.println("d2's name: " + d2.name + "\n" + "d2 syas:" + d2.says);

		Dog d3 = new Dog();
		d3 = d1;
		System.out.println("d1 equals d3:" + d3.equals(d1));
		System.out.println("d1==d3:" + (d1 == d3));

	}
}
