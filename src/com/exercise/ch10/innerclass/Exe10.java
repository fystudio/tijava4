package com.exercise.ch10.innerclass;
//Exe09-11: 在方法和作用域内的内部类
import static net.mindview.util.Print.print;

public class Exe10 {

	public void verify(boolean tag) {
		if (tag) {
			class TT {
				public TT() {
					print("TT");
				}
			}

			new TT();
		}

	}

	public static void main(String[] args) {
		Exe10 e10 = new Exe10();
		e10.verify(true);

	}

}
//在类的方法作用域内创建内部类
