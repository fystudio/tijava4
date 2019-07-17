package com.exercise.ch05.initialization;

public class Exercise3 {

	Exercise3(){
		System.out.println("Default");
	}
	Exercise3(int i){
		System.out.println("not default:"+i);
	}
	
	public static void main(String args[]){
	 new Exercise3();
	 new Exercise3(5);
	}
}
