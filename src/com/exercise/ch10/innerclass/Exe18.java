package com.exercise.ch10.innerclass;

interface Dest {

}

class Destl implements Dest {
}

class Test {

	Dest getDest() {
		return new Destl() {
		};
	}

}

public class Exe18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
