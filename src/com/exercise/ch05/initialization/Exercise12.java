package com.exercise.ch05.initialization;

public class Exercise12 {
	boolean empty = false;

	Exercise12(boolean state) {
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
		Exercise12 tank = new Exercise12(true);
		tank.isEmpty();
		
		new Exercise12(true);
		System.gc();
	}
}
