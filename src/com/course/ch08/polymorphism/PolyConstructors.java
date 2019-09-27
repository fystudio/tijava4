package com.course.ch08.polymorphism;

import static net.mindview.util.Print.*;

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
class RectangularGlyph extends Glyph{
	private int dot= 1;

	public RectangularGlyph(int d) {
		dot= d;
		print("RectangularGlyph(),dot=" + dot);
	}

	void draw() {
		print("RectangularGlyph(),dot=" + dot);
	}
}
class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RouldGlyph(),radius=" + radius);
	}

	void draw() {
		print("RoundGlyhp.draw(),radius=" + radius);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);

	}

}
/*Glyph() before draw()
RoundGlyhp.draw(),radius=0   (initialize before defined)
Glyph() after draw()
RoundGlyph.RouldGlyph(),radius=5
* */