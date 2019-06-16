package com.exercise.ch07.resuseclasses;

/*
 * 证明基类构造器：总是会被调用，在导出类构造器之前被调用
 * 
 */
class Art1 {
	private String a1;

	public Art1() {
		a1 = "Art1";
	}

	public String toString() {
		return a1;
	}
}

class Drawing1 extends Art1 {
	private String d1;

	public Drawing1() {
		d1 = "Drawing1";
	}

	public String toString() {
		return d1 + "\n" + "d1'super=" + super.toString();
	}
}

class Cartoon1 extends Drawing1 {

	private String c1;

	public Cartoon1() {
		c1 = "Cartoon1";
	}

	public String toString() {
		return c1 + "\n" + "c1's super=" + super.toString();
	}

}

public class Exe04 extends Cartoon1 {

	private String e1;

	public Exe04() {
		e1 = "Exe04";
	}

	public String toString() {
		return "e1=" + e1 + "\n" + "e1's super=" + super.toString();
	}

	public static void main(String[] args) {
		Exe04 exe04 = new Exe04();
		System.out.println(exe04);
	}

}
