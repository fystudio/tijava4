package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

public class Exe05 {

	class Inner {
		public Inner() {
			print("Inner");
		}
	}

	public static void main(String[] args) {

		Exe05 exe = new Exe05();
		Exe05.Inner in = exe.new Inner();

	}

}
