package com.tji4exe.ch07.resuingClasses;

/*
 * 创建一个简单的类。在第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化这个对象
 * 
 * */
class Bass {
	private String b;

	public Bass() {
		b = "bass string";
	}

	public String toString() {

		return b;
	}
}

public class Exe01 {
	private Bass bb;

	public String toString() {
		if (bb == null) {// Delayed initialization
			bb = new Bass();
		}
		return "bb=" + bb;
	}

	public static void main(String[] args) {
		Exe01 exe01 = new Exe01();
		System.out.println(exe01);

	}

}
