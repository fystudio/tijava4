//: interfaces/interfaceprocessor/StringProcessor.java
package com.tji4.ch09.interfaces;

import java.util.*;

public abstract class StringProcessor implements Processor2 {
	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);

	public static String s = "If she weighs the same as a duck, she's made of wood";

	public static void main(String[] args) {
		Apply2.process(new Upcase2(), s);
		Apply2.process(new Downcase2(), s);
		Apply2.process(new Splitter2(), s);
	}
}

class Upcase2 extends StringProcessor {
	public String process(Object input) { // Covariant return
		return ((String) input).toUpperCase();
	}
}

class Downcase2 extends StringProcessor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter2 extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
} /*
	 * Output: Using Processor Upcase IF SHE WEIGHS THE SAME AS A DUCK, SHE'S
	 * MADE OF WOOD Using Processor Downcase if she weighs the same as a duck,
	 * she's made of wood Using Processor Splitter [If, she, weighs, the, same,
	 * as, a, duck,, she's, made, of, wood]
	 */// :~
