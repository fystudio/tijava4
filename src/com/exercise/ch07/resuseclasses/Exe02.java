package com.exercise.ch07.resuseclasses;

import com.course.ch07.reuseclasses.Detergent;

public class Exe02 extends Detergent {

	public void scrub() {
		append("Detegent2.scrub()");
		super.scrub();
	}

	public void sterillize() {
		append("sterillize()");
	}

	public static void main(String[] args) {
		Exe02 x = new Exe02();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.sterillize();
		System.out.println(x);

	}

}
