package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

class Out1 {

	void verfy() {
//!		print(in);
	}

	class Inn1 {
		private String in = "inn";
	}
}

public class Exercise08 {
	public static void main(String[] args) {
		new Out1().verfy();
	}
}
