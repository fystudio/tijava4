package com.exercise.ch09.interfaces;

abstract class BaseExe04 {

	abstract public void print();
}

class ChildExe04 extends BaseExe04 {
	public void print() {
		System.out.println("calling Child");
	}

	public static void change(BaseExe04 b) {
		((ChildExe04) b).print();
	}

	public static void change2(BaseExe04 b) {
		b.print();
	}
}

public class Exe04 {

	public static void main(String[] args) {
		ChildExe04 e2 = new ChildExe04();
		ChildExe04.change(e2);
		ChildExe04.change2(e2);
	}
}
