package com.exercise.ch10.innerclass;
//Exercise 11:
//(2) Create a private inner class that implements a public interface. Write
//a method that returns a reference to an instance of the private inner class, upcast to the
//interface. Show that the inner class is completely hidden by trying to downcast to it.
import static net.mindview.util.Print.print;

interface Language {
	void speak();
}

public class Exercise11 {

	private class English implements Language {

		@Override
		public void speak() {
			print("speak English");

		}
		
		public void write(){
			print("write in English");
		}

	}

	Language talk() {
		return new English();
	}

	public static void main(String[] args) {
		Exercise11 e11 = new Exercise11();
		English eg = (English) e11.talk();
		eg.write();
		Language lg = e11.talk();
		lg.speak();

	}

}

//?? 如何向下转型证明是隐藏的
