package com.tji4exe.ch10.innerclass;

import static net.mindview.util.Print.print;
// why not call toString automatically ?
class Outer1 {
	private String name = "Outer1";

	class Inner1 {

		public Inner1() {
			//print("new Inner");
		}

		public void printInner() {
			//print("Print Inner");
		}

		public String toString() {
			print("Print Inner toString");
			return name;
		}
	}

	Inner1 getInner() {
		return new Inner1();
	}
}

public class Exe03 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner1 inner = out.getInner();
	//	inner.toString();

	}

}
