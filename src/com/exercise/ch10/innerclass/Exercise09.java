package com.exercise.ch10.innerclass;
//Exe09-11: 在方法和作用域内的内部类
import static net.mindview.util.Print.print;
/*
Exercise 9:(1) Create an interface with at least one method, and implement that
interface by defining an inner class within a method, which returns a reference to your
interface.
* */

interface TED {
	void spread();
}

public class Exercise09 {

	public TED call() {
		class TEDX implements TED {

			@Override
			public void spread() {
				print("TEDX spread");
			}
		}
		return new TEDX();
	}
//	new TEDX();
	
	public static void main(String[] args) {
		Exercise09 td = new Exercise09();
		TED tdx = td.call();
		tdx.spread();

	}

}
// 在内部类中创建内部类TEDX，此类只能在TED内部使用
