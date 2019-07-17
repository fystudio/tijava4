package com.exercise.ch03.operators;

import java.util.Random;

class Floater {

	float value;
}

public class Exercise2 {

	public static void main(String[] args) {
		Floater v1 = new Floater();
		Floater v2 = new Floater();
		Random r = new Random(10);		
		v1.value = r.nextFloat();
		v2.value = r.nextFloat();
		System.out.println("v1.value:" + v1.value + "\n" + "v2.value:" + v2.value);
		v1=v2;
		System.out.println("v1.value:" + v1.value + "\n" + "v2.value:" + v2.value);

	}

}
