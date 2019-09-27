package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

interface Inn {
	void modify();
}

class Out12 {

	public Inn calling() {
		return new Inn() {
			{
				print("inner Inn");
				modify();
			}

			@Override
			public void modify() {
				print("modify");

			}
		};

	}

}

public class Exe12 {

	public static void main(String[] args) {
		Out12 ot = new Out12();
		ot.calling();

	}

}
