package com.tji4exe.ch09.interfaces;

import static net.mindview.util.Print.print;

interface FastFood {

	void takeout();

	void getBread();

	void getCheese();

	void getLettuce();

}

class Sandwich implements FastFood {

	@Override
	public void takeout() {
		print(this + "takeout()");

	}

	@Override
	public void getBread() {
		print(this + "getBread()");

	}

	@Override
	public void getCheese() {
		print(this + "getCheese()");

	}

	@Override
	public void getLettuce() {
		print(this + "getLettuce()");

	}
}

public class Exe08 {

	public static void main(String[] args) {
		Sandwich sw = new Sandwich();
		sw.takeout();
		sw.getBread();
		sw.getCheese();
		sw.getLettuce();

	}

}

//com.tji4exe.ch09.interfaces.Sandwich@15db9742takeout()
//com.tji4exe.ch09.interfaces.Sandwich@15db9742getBread()
//com.tji4exe.ch09.interfaces.Sandwich@15db9742getCheese()
//com.tji4exe.ch09.interfaces.Sandwich@15db9742getLettuce()