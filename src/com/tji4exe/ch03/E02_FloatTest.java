package com.tji4exe.ch03;

import java.util.Random;

class V {

	float value;
}

public class E02_FloatTest {

	public static void main(String[] args) {
		V v1 = new V();
		V v2 = new V();
		Random r = new Random(10);		
		v1.value = r.nextFloat();
		v2.value = r.nextFloat();
		System.out.println("v1.value:" + v1.value + "\n" + "v2.value:" + v2.value);
		v1=v2;
		System.out.println("v1.value:" + v1.value + "\n" + "v2.value:" + v2.value);

	}

}
