package com.tji4exe.ch07.resuingClasses;
/*
 * 请证明加载类的动作仅发生一次。证明该类的第一个实体的创建或者对static成员的访问可能引起加载
 * */
public class Exe23 {

	public Exe23(){
		System.out.println("Exe23...");
	}
	
	private static int x = printInt("print x");
	
	 static int printInt(String s){
		System.out.println("s");
		return 1;
	}
	 
	 public static void main(String[] args){
		 new Exe23();
	 }
	
}
/**
 * s
Exe23...
 * **/
 