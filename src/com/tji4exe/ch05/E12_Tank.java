package com.tji4exe.ch05;

public class E12_Tank {
	boolean empty = false;

	E12_Tank(boolean state) {
		empty = state;
	}
	
	void isEmpty(){
		empty = false;
	}
	
	protected void finalize(){
		if(empty){
			System.out.println("The Tank is full , empty it");
		}
	}
	
	public  static void main(String args[]){
		E12_Tank tank = new E12_Tank(true);
		tank.isEmpty();
		
		new E12_Tank(true);
		System.gc();
	}
}
