package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

public class Exercise12 {
	boolean empty = false;

	Exercise12(boolean state) {
		empty = state;
	}
	
	void filling(){
		empty = false;
		print("Tank is filling up ");
	}
	void draining(){
		empty = true;
		print("Tank is draining");
	}
	protected void finalize(){
		if(empty){
			print("The Tank is drained , bye bye");
		}
	}
	
	public  static void main(String args[]){
		Exercise12 tank = new Exercise12(true);
		tank.filling();
		tank.draining();
		new Exercise12(true);
		System.gc();
	}
}
