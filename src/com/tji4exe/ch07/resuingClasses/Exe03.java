package com.tji4exe.ch07.resuingClasses;

/*
 * 
 * 即使你不为cartoon（）创建构造器，编译器也会为你合成一个默认构造器，该构造器将调用基类构造器
 *
 */
class Art {
	public Art() {
		System.out.println("print Art()");
	}
}

class Drawing extends Art {
	public Drawing() {
		System.out.println("print Drawing()");
	}
}

class Cartoon extends Drawing {

	// public Cartoon() {
	// System.out.println("print Cartoon()");
	// }

}

public class Exe03 extends Cartoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exe03();

	}

}
