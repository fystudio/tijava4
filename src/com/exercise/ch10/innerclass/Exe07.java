package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

class Out {
	private String outstring = "abc";

	private void take() {
		print("take");
		print(outstring);
	}

	public void calling() {
		Inn in = new Inn();
		in.modify();

	}

	class Inn {
		void modify() {
			outstring = "edf";
			take();
		}
	}
}

public class Exe07 {

	public static void main(String[] args) {
		Out12 o = new Out12();
		o.calling();
	}

}
//take
//edf