package com.exercise.ch10.innerclass;

import static net.mindview.util.Print.print;

interface TED13 {
	void spread();
}

class TEDX implements TED13{

	@Override
	public void spread() {
		// TODO Auto-generated method stub
		
	}};

public class Exe13 {

	public TEDX share() {
		return new TEDX() {

			@Override
			public void spread() {
				print("TEDX spread");
				
			}

		};

	}
	// new TEDX();

	public static void main(String[] args) {
		Exe13 e13 = new Exe13();
		TEDX td = e13.share();
		td.spread();

	}

}
