package com.tji4exe.ch07.resuingClasses;

/**
 * 创建一个类，它应带有一个被重载了三次的方法。继承产生一个新类，并添加一个该方法的新的重载方法，展示这四个方法在导出类中都是可以实用的
 */

class Base {
	public void play(String a) {
		System.out.println("play string");
	}

	public void play(int i) {
		System.out.println("play int");
	}

	public void play(float f) {
		System.out.println("play float");
	}
}

class Child extends Base {
	public void play(char c) {
		System.out.println("play char");
	}
}

public class Exe13 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.play('c');
		ch.play(1.0f);
		ch.play(9);
		ch.play("st");

	}

}
