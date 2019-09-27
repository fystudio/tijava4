package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.*;

class A {
	public A() {
		print("print A()");
	}
}


class B extends A{
	public B(){
		print("print B()");
	}
}

class C{
	public C(){
		print("print C()");
	}
}

class D{
	public D(){
		print("print D()");
	}
}

public class Exercise12 extends A {
	private C c = new C();
	private D d = new D();
	public Exercise12() {
		print("print Exercise2");
	}

	public static void main(String[] args) {
		new Exercise12();
	}
} 

//print A()
//print C()
//print D()
//print Exe12