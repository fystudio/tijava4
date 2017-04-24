package com.tji4exe.ch08.polymorphism;

import static net.mindview.util.Print.print;

class Glyph {
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph() {
		print("RoundGlyph() before draw()");
		draw();
		print("RoundGlyph() after draw()");
	}

//	RoundGlyph(int r) {
//		radius = r;
//		print("RoundGlyph.RouldGlyph(),radius=" + radius);
//	}

	void draw() {
		print("RoundGlyhp.draw(),radius=" + radius);
	}
}

class RetangularGlyph extends RoundGlyph {
	private int radius = 4;

	RetangularGlyph(int r) {
		
		radius = r;
		print("RetangularGlyph.draw(), radius=" + radius);
	}

	void draw() {
		print("RetangularGlyph.draw(),radius=" + radius);
	}

}

public class Exe15 {

	public static void main(String[] args) {
		new RetangularGlyph(11);

	}

}
