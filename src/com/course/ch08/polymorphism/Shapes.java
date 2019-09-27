//: polymorphism/shape/Shape.java
// factory
package com.course.ch08.polymorphism;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for (int i = 0;i<s.length;i++){
			s[i] = gen.next();
		}
		
		for(Shape shp:s){
			//shp.draw();
			shp.move();
		}
		
//		Circle[] c = new Circle[3];
//		for(int j = 0;j<c.length;j++)
//		{
//			c[j] = (Circle) gen.next();
//		}
//		
	}
} /// :~
