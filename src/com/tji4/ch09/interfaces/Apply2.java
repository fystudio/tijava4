//: interfaces/interfaceprocessor/Apply.java
package com.tji4.ch09.interfaces;

import static net.mindview.util.Print.*;

public class Apply2 {
	public static void process(Processor2 p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
} /// :~
