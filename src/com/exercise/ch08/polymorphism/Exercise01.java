package com.exercise.ch08.polymorphism;

import com.course.ch08.polymorphism.Wheel;
/*create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride() method
* */
class Cycle{
	public void ride(Wheel w){
		System.out.println("Cycle.ride");
		
	}
}

class Unicycle extends Cycle{
	public void ride(Wheel w){
		System.out.println("Unicycle.ride:"+Wheel.ONE_WHEEL);
		
	}
	
}

class Bicycle extends Cycle{
	public void ride(Wheel w){
		System.out.println("Bicycle.ride:"+Wheel.TWO_WHEELS);
		
	}
	
}

class Tricycle extends Cycle{
	public void ride(Wheel w){
		System.out.println("Tricycle.ride:"+Wheel.THREE_WHEELS);
		
	}
	
}

public class Exercise01{

	public static void main(String[] args) {
		Cycle u = new Unicycle();
		u.ride(Wheel.ONE_WHEEL);
		
		Cycle b = new Bicycle();
		b.ride(Wheel.TWO_WHEELS);
		
		Cycle t = new Tricycle();
		t.ride(Wheel.THREE_WHEELS);
	}

}
//Unicycle.ride:ONE_WHEEL
//Bicycle.ride:TWO_WHEELS
//Tricycle.ride:THREE_WHEELS