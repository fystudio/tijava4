package com.course.ch08.polymorphism;

import static net.mindview.util.Print.*;

class Derived extends PrivateOverride{
	public void f(){
		print("print public f()");
	}
}

public class PrivateOverride {
	private void f() {
		print("print private f()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride po = new Derived();
		po.f();

	}

}
