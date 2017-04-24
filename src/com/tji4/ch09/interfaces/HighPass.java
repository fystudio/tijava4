//: interfaces/filters/HighPass.java
package com.tji4.ch09.interfaces;

public class HighPass extends Filter {
	double cutoff;

	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input;
	}
} /// :~
