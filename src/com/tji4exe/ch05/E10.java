package com.tji4exe.ch05;

public class E10 {

	protected void finalize(){
		System.out.println("finalize");
		//super.finalize();
	}
		
	
	
	public  static void main(String args[]){
		
		new E10();
		//new E10();
		System.gc();
		//e10.finalize();
	}
}
