package com.exercise.ch07.resuseclasses;

/*
 * 将一个适合的dispose（）方法的层次结构添加到练习9中
 * **/
class Component12 {
	public Component12() {
		System.out.println("Component12");
	}

	public void dispose() {
		System.out.println("Erasing Component12");
	}
}

class Component22 {
	public Component22() {
		System.out.println("Component22");
	}

	public void dispose() {
		System.out.println("Erasing Component22");
	}
}

class Component32 {
	public Component32() {
		System.out.println("Component32");
	}

	public void dispose() {
		System.out.println("Erasing Component32");
	}
}

class Root2 {
	public Component12 c1;
	public Component22 c2;
	public Component32 c3;

	public Root2() {
		System.out.println("Root");
		c1 = new Component12();
		c2 = new Component22();
		c3 = new Component32();
	}
	
	public void dispose(){
		c1.dispose();
		c2.dispose();
		c3.dispose();
	}
}

public class Exe12 {

	public static void main(String[] args) {
		Root2 r2 = new Root2();
		
		try{
			//
		}finally{
			r2.dispose();
		}

	}

}
