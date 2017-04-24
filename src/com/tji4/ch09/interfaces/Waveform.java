//: interfaces/filters/Waveform.java
package com.tji4.ch09.interfaces;

public class Waveform {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
} /// :~
