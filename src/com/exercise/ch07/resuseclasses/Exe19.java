package com.exercise.ch07.resuseclasses;

/*
 * 创建一个含有指向某对象的空白final引用的类，在所有构造器内部都执行空白final的初始化动作
 * **/
class Test {
	private int i = 0;

	public Test() {
		System.out.println("i:" + i);
	}

	public Test(int j) {
		i = j;
		System.out.println("i:" + i);
	}

}

public class Exe19 {
	private final Test t;
	private int i = 1;
	public Exe19() {
		t = new Test();
	}

	public Exe19(int j) {
		i = j;
		t = new Test(i);
	}


	public static void main(String[] args) {
		new Exe19();
		new Exe19(11);
	}
}
