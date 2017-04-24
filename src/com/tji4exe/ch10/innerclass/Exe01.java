package com.tji4exe.ch10.innerclass;

import static net.mindview.util.Print.*;

class Outer {
	class Inner {

		public Inner() {
			print("new Inner");
		}

		public void printInner() {
			print("Print Inner");
		}
	}

	Inner getInner() {
		return new Inner();
	}
}

public class Exe01 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inner = out.getInner();
		inner.printInner();
	}

}
