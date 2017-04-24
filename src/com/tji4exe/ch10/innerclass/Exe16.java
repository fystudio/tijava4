package com.tji4exe.ch10.innerclass;

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

	static CycleFactory factory() {
		return new CycleFactory() {

			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new UniCycle();
			}

		};
	}
}

class BiCycle implements Cycle {

	@Override
	public void roll() {
		print("BiCycle roll");
	}

	static CycleFactory factory() {
		return new CycleFactory() {

			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new BiCycle();
			}

		};
	}
}

class TriCycle implements Cycle {

	@Override
	public void roll() {
		print("TriCycle roll");

	}

	static CycleFactory factory() {
		return new CycleFactory() {

			@Override
			public Cycle getCycle() {
				// TODO Auto-generated method stub
				return new TriCycle();
			}

		};
	}
}

public class Exe16 {
	public static void cycleConsumer(CycleFactory fact) {
		Cycle c = fact.getCycle();
		c.roll();
	}

	public static void main(String[] args) {
		cycleConsumer(UniCycle.factory());
		cycleConsumer(BiCycle.factory());
		cycleConsumer(TriCycle.factory());

	}

}
