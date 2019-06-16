package com.exercise.ch05.initialization;

public class E03_Constructor {

	E03_Constructor(){
		System.out.println("Default");
	}
	E03_Constructor(int i){
		System.out.println("not default:"+i);
	}
	
	public static void main(String args[]){
	 new E03_Constructor();
	 new E03_Constructor(5);
	}
}
