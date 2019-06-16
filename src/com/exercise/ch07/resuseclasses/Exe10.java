package com.exercise.ch07.resuseclasses;

/*
 * 修改练习10，使每个类都仅具有非默认构造器。
 * 
 */
class Component11 {
	public Component11(int i) {
		System.out.println("Component1");
	}
}

class Component21 {
	public Component21(int i) {
		System.out.println("Component2");
	}
}

class Component31 {
	public Component31(int i) {
		System.out.println("Component3");
	}
}

class Root1 {
	public Component11 c1 = new Component11(11);
	public Component21 c2 = new Component21(21);
	public Component31 c3 = new Component31(31);

	public Root1(int i) {
		System.out.println("Root");
	}
}

public class Exe10 extends Root1 {

	public Exe10(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		new Exe10(10);
	}

}
