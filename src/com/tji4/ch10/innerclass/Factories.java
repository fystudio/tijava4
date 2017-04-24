package com.tji4.ch10.innerclass;

//: interfaces/Factories.java
import static net.mindview.util.Print.*;

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	private Implementation1() {
	}

	public void method1() {
		print("Implementation1 method1");
	}

	public void method2() {
		print("Implementation1 method2");
	}

	public static ServiceFactory factory() {
		return new ServiceFactory() {

			@Override
			public Service getService() {
				// TODO Auto-generated method stub
				return new Implementation1();
			}

		};
	}

}

class Implementation2 implements Service {
	private Implementation2() {
	}

	public void method1() {
		print("Implementation2 method1");
	}

	public void method2() {
		print("Implementation2 method2");
	}

	public static ServiceFactory factory() {
		return new ServiceFactory() {

			@Override
			public Service getService() {
				// TODO Auto-generated method stub
				return new Implementation2();
			}

		};
	}

}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory());
		serviceConsumer(Implementation2.factory());
	}
} /*
	 * Output: Implementation1 method1 Implementation1 method2 Implementation2
	 * method1 Implementation2 method2
	 */// :~
