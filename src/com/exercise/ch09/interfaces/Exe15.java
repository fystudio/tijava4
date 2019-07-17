package com.exercise.ch09.interfaces;

import static net.mindview.util.Print.print;

interface Wheel1 {
	void forward();

	void backward();
}

interface Door1 {
	void open();

	void close();
}

interface Window1 {
	void rollup();

	void rolldown();
}

interface Ceilling1 extends Window {
	void open();
}

abstract class AbCar implements Door, Window, Wheel, Ceilling {

}

class RealCar extends AbCar {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		print("RCar open");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		print("RCar close");

	}

	@Override
	public void rollup() {
		// TODO Auto-generated method stub
		print("RCar rollup");

	}

	@Override
	public void rolldown() {
		// TODO Auto-generated method stub
		print("RCar rolldown");

	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		print("RCar forward");

	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		print("RCar backward");

	}

}

public class Exe15 {
	static void a(Window w) {
		w.rollup();
		w.rolldown();
	}

	static void b(Door d) {
		d.open();
		d.close();
	}

	static void c(Wheel w) {
		w.forward();
		w.backward();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealCar car = new RealCar();
		a(car);
		b(car);
		c(car);

	}

}
