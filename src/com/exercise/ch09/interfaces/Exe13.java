package com.exercise.ch09.interfaces;

import static net.mindview.util.Print.print;

interface Intf1 {
	void test1();
}

interface Intf2 extends Intf1 {
	void test2();
}

interface Intf3 extends Intf1 {

	void test3();
}

interface Intf4 extends Intf2, Intf3 {

	void test4();
}

public class Exe13 implements Intf4 {

	public static void main(String[] args) {
		Exe13 e13 = new Exe13();
		e13.test1();
		e13.test2();
		e13.test3();
		e13.test4();

	}

	@Override
	public void test2() {
		print("test2");

	}

	@Override
	public void test1() {
		print("test1");

	}

	@Override
	public void test3() {
		print("test3");

	}

	@Override
	public void test4() {
		print("test4");

	}

}

//test1
//test2
//test3
//test4
