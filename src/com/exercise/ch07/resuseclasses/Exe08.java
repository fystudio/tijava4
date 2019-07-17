package com.exercise.ch07.resuseclasses;

/*
 * 创建一个基类，它仅有一个非默认构造器。为C写一个构造器并在其中执行所有初始化。
 * 
 */
class Exe {
	public Exe() {
		System.out.println("Exe");
	}
}

public class Exe08 extends Exe {

	public Exe08() {
		System.out.println("Exe08");
	}

	public Exe08(int i) {

		// super();
		System.out.println("Exe i");
	}

	public static void main(String[] args) {
		new Exe08();
		new Exe08(11);
	}
}
