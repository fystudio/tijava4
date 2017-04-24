package com.tji4exe.ch10.innerclass;
//Exe09-11: 在方法和作用域内的内部类
import static net.mindview.util.Print.print;

interface Language {
	void speak();
}

public class Exe11 {

	private class English implements Language {

		@Override
		public void speak() {
			print("speak");

		}
		
		public void write(){
			print("write");
		}

	}

	Language talk() {
		return new English();
	}

	public static void main(String[] args) {
		Exe11 e11 = new Exe11();
		English eg = (English) e11.talk();
		eg.write();
		Language lg = e11.talk();
		lg.speak();

	}

}

//?? 如何向下转型证明是隐藏的
