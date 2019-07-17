//: interfaces/filters/LowPass.java
package com.course.ch09.interfaces;

public class LowPass extends Filter {
	double cutoff;

	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input; // Dummy processing
	}
} /// :~
