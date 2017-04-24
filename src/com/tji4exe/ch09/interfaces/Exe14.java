package com.tji4exe.ch09.interfaces;

import static net.mindview.util.Print.print;

interface Wheel {
	void forward();

	void backward();
}

interface Door {
	void open();

	void close();
}

interface Window {
	void rollup();

	void rolldown();
}

interface Ceilling extends Window1 {
	void open();
}

class Car implements Door1, Window1, Wheel1, Ceilling1 {

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		print("car forward");

	}

	@Override
	public void backward() {
		// TODO Auto-generated method stub
		print("car backward");

	}

	@Override
	public void rollup() {
		// TODO Auto-generated method stub
		print("car rollup");

	}

	@Override
	public void rolldown() {
		// TODO Auto-generated method stub
		print("car rolldown");

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		print("car open");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		print("car close");

	}
}

public class Exe14 {
	static void a(Window1 w) {
		w.rollup();
		w.rolldown();
	}

	static void b(Door1 d) {
		d.open();
		d.close();
	}

	static void c(Wheel1 w) {
		w.forward();
		w.backward();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Car car = new Car();
		a(car);
		b(car);
		c(car);

	}

}
