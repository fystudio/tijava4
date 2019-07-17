package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

public class Exercise2 {

	public String s1= "abc";
	public String s2;
	Exercise2(){
		print(this.s2);
		print(this.s1);
		this.s2 = "efg";
		print(this.s2);
	}
	
	public static void main(String args[]){
		
		new Exercise2();

	}
}
