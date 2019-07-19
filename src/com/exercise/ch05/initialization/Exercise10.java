package com.exercise.ch05.initialization;

public class Exercise10 {

	protected void finalize(){
		System.out.println("finalize");
		//super.finalize();
	}

	public  static void main(String args[]){
		
		new Exercise10();
		//new E10();
		System.gc();
		//e10.finalize();
	}
}
