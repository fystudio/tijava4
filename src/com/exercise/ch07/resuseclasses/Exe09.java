package com.exercise.ch07.resuseclasses;

/*
 * 创建一个Root类，令其含有名Component1,Component2,Component3 类的实例。
 * 所有类都应有打印出类的相关信息的默认构造器。
 * 
 */
class Component1 {
	public Component1() {
		System.out.println("Component1");
	}
}

class Component2 {
	public Component2() {
		System.out.println("Component2");
	}
}

class Component3 {
	public Component3() {
		System.out.println("Component3");
	}
}

class Root {
	public Component1 c1 = new Component1();
	public Component2 c2 = new Component2();
	public Component3 c3 = new Component3();

	public Root() {
		System.out.println("Root");
	}
}

public class Exe09 extends Root {
	public Component1 c1 = new Component1();
	public Component2 c2 = new Component2();
	public Component3 c3 = new Component3();

	public Exe09() {
		System.out.println("Exe09");
	}

	public static void main(String[] args) {
		new Exe09();

	}
}
