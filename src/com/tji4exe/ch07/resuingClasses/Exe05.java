package com.tji4exe.ch07.resuingClasses;
/*
 * 创建两个带有默认构造器的类A和B.从A中继承产生一个名为C的新类，并在C内创建一个B类的成员。
 * 不要给C编写构造器。创建一个C类的对象并观察其结果。
 * 
 */
class A {
	public A() {
		System.out.println("A");
	}
}

class B {
	public B() {
		System.out.println("B");
	}
}

public class Exe05 extends A {

	B b = new B();
	public Exe05(){
		System.out.println("c");
	}
	public static void main(String[] args) {
		new Exe05();
	}

}
// A B C 