package com.exercise.ch09.interfaces;

import com.course.ch09.interfaces.Exe05I;
import static net.mindview.util.Print.print;

public class Exe05 implements Exe05I {

	@Override
	public void change() {
		print(this + "change()");

	}

	@Override
	public String what() {
		return "Exe05";

	}

	@Override
	public void verify() {
		print(this + "verify()");

	}

	public static void main(String[] args) {
		Exe05 ex05 = new Exe05();
		ex05.change();
		print(ex05.what());
		ex05.verify();
	}

}
