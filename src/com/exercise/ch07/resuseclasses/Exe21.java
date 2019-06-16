package com.exercise.ch07.resuseclasses;
/**
 * 
 * 创建一个带final的方法，由继承产生一个类并尝试覆盖该方法
 *
 */
class Wind {
	private final void f(){
		System.out.println("I'm cold");
	}
}
public class Exe21 extends Wind {

	public final void f (){
		System.out.println("I'm hot");
	}
	public static void main(String[] args) {
		Exe21 fd = new Exe21();
		fd.f();

	}

}
