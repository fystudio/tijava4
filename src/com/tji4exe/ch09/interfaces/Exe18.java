package com.tji4exe.ch09.interfaces;

import static net.mindview.util.Print.print;

interface Cycle {
	void roll();
}

interface CycleFactory {
	Cycle getCycle();
}

class UniCycle implements Cycle {

	@Override
	public void roll() {
		print("UniCycle roll");

	}
}

class BiCycle implements Cycle {

	@Override
	public void roll() {
		print("BiCycle roll");
	}
}

class TriCycle implements Cycle {

	@Override
	public void roll() {
		print("TriCycle roll");

	}
}

class BiCycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new BiCycle();
	}

}

class UniCycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new UniCycle();
	}
}

class TriCycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		// TODO Auto-generated method stub
		return new TriCycle();
	}
}

public class Exe18 {
	public static void cycleConsumer(CycleFactory fact) {
		Cycle c = fact.getCycle();
		c.roll();
	}

	public static void main(String[] args) {
		cycleConsumer(new UniCycleFactory());
		cycleConsumer(new BiCycleFactory());
		cycleConsumer(new TriCycleFactory());
		

	}

}
