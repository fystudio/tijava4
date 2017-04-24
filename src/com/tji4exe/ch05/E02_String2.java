package com.tji4exe.ch05;

public class E02_String2 {

	public String s1= "abc";
	public String s2;
	E02_String2(){
		System.out.println(this.s2);
		System.out.println(this.s1);
		this.s2 = "efg";
		
		System.out.println(this.s2);
	}
	
	public static void main(String args[]){
		
		new E02_String2();

	}
}
