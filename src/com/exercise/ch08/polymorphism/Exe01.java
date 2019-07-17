package com.exercise.ch08.polymorphism;

import com.course.ch08.polymorphism.Wheel;

/*
 * åˆ›å»ºä¸€ä¸ªCycle ç±»ï¼Œå®ƒå…·æœ‰å­�ç±» Unicycleï¼ŒBicycleï¼ŒTricycle
 * æ¼”ç¤ºæ¯�ä¸€ä¸ªå®žä¾‹éƒ½å�¯ä»¥ç»�ç”±ride æ–¹æ³•å�‘ä¸Šè½¬åž‹ä¸ºCycle
 * */
class Cycle{
	public void ride(Wheel w){
		System.out.println("Cycle.ride");
		
	}
}

class Unicycle extends Cycle2{
	public void ride(Wheel w){
		System.out.println("Unicycle.ride:"+Wheel.ONE_WHEEL);
		
	}
	
}

class Bicycle extends Cycle2{
	public void ride(Wheel w){
		System.out.println("Bicycle.ride:"+Wheel.TWO_WHEELS);
		
	}
	
}

class Tricycle extends Cycle2{
	public void ride(Wheel w){
		System.out.println("Tricycle.ride:"+Wheel.THREE_WHEELS);
		
	}
	
}

public class Exe01 {

	
	public static void main(String[] args) {
		Cycle2 u = new Unicycle();
		u.ride(Wheel.ONE_WHEEL);
		
		Cycle2 b = new Bicycle();
		b.ride(Wheel.TWO_WHEELS);
		
		Cycle2 t = new Tricycle();
		t.ride(Wheel.THREE_WHEELS);
	}

}
//Unicycle.ride:ONE_WHEEL
//Bicycle.ride:TWO_WHEELS
//Tricycle.ride:THREE_WHEELS