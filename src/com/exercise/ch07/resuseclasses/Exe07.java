package com.exercise.ch07.resuseclasses;

/*
 * 修改练习5，使A和B以带参数的构造器取代默认构造器。为C写一个构造器，并在其中执行所有初始化。
 * 
 */
class A1 {
	public A1(int i) {
		System.out.println("A");
	}
}

class B1 {
	public B1(int i) {
		System.out.println("B");
	}
}

public class Exe07 extends A1 {
	B1 b;

	public Exe07() {

		super(11);
		new B1(11);
		System.out.println("C");

	}

	public static void main(String[] args) {
		new Exe07();
	}

}
