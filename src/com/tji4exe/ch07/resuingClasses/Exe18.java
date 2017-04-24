package com.tji4exe.ch07.resuingClasses;
/*
 * 创建一个有static final 和final域的类，说明两者的区别
 * **/

import java.util.Random;

public class Exe18 {
	private static Random rand = new Random(47);
	private static final int i = rand.nextInt(11);
	private final int j =rand.nextInt(11);
	
	public Exe18(){
		
	}
	
	public String toString(){
		return "i:"+i+","+"j:"+j;
	}
	public static void main(String[] args) {
		Exe18 f1 = new Exe18();
		//exe18.j=32;
		System.out.println(f1);
		Exe18 f2 = new Exe18();
		System.out.println(f2);
		//j不是static的，所以它的值在运行时候会改变

	}

}
