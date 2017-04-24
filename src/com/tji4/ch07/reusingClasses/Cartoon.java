package com.tji4.ch07.reusingClasses;

class Art {
	public Art() {
		System.out.println("print Art()");
	}
}

class Drawing extends Art {
	public Drawing() {
		System.out.println("print Drawing()");
	}
}

public class Cartoon extends Drawing {

	public Cartoon() {
		System.out.println("print Cartoon()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartoon cartoon = new Cartoon();

	}

}
