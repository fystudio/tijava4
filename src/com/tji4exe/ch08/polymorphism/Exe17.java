package com.tji4exe.ch08.polymorphism;

import static net.mindview.util.Print.*;
import com.tji4.ch08.polymorphism.Wheel;

class Cycle3 {
	public void ride(Wheel w) {
		System.out.println("Cycle.ride");

	}

	public void balance() {
		print("Cycle3.balance");
	}
}

class Unicycle3 extends Cycle3 {
	public void ride(Wheel w) {
		System.out.println("Unicycle.ride:" + Wheel.ONE_WHEEL);

	}

	public void balance() {
		print("Unicycle3.balance");
	}

}

class Bicycle3 extends Cycle3 {
	public void ride(Wheel w) {
		System.out.println("Bicycle.ride:" + Wheel.TWO_WHEELS);

	}

	public void balance() {
		print("Bicycle3.balance");
	}

}

class Tricycle3 extends Cycle3 {
	public void ride(Wheel w) {
		System.out.println("Tricycle.ride:" + Wheel.THREE_WHEELS);

	}

	// public void balance() {
	// print("Tricycle3.balance");
	// }

}

public class Exe17 {

	public static void main(String[] args) {
		Cycle3 u = new Unicycle3();
		u.balance();
		Cycle3 b = new Bicycle3();
		b.balance();
		Cycle3 t = new Tricycle3();
		t.balance();

		((Unicycle3) u).balance();

		((Bicycle3) u).balance();

		((Tricycle3) u).balance();

	}

}
