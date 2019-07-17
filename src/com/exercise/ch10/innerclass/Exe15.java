package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

class OExe15 {
	public OExe15(int i) {
		print("i:" + i);
	}
}

public class Exe15 {

	OExe15 getO(int i) {
		return new OExe15(i) {
		};
	}

	public static void main(String[] args) {
		Exe15 e15= new Exe15();
		e15.getO(15);

	}

}
