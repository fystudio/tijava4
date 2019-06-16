package com.exercise.ch07.resuseclasses;
/*展示@Override注解可以解决FinalOverrindingIllusion的问题
 * ???
 * */


class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}

	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}

	public void g() {
		System.out.println("OverridingPrivate.g()");
	}
}



public class Exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
