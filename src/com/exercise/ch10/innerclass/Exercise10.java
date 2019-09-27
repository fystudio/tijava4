package com.exercise.ch10.innerclass;
//(1) Repeat the previous exercise but define the inner class within a scope
//within a method.
import static net.mindview.util.Print.print;

public class Exercise10 {

	public void verify(boolean tag) {
		if (tag) {
			class YIXI {
				public YIXI() {
					print("Yi Xi");
				}
			}

			new YIXI();
		}

	}

	public static void main(String[] args) {
		Exercise10 e10 = new Exercise10();
		e10.verify(true);
	}

}
