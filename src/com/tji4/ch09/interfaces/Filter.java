//: interfaces/filters/Filter.java
package com.tji4.ch09.interfaces;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}

	public Waveform process(Waveform input) {
		return input;
	}
} /// :~
