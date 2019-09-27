package com.exercise.ch08.polymorphism;

import com.course.ch08.polymorphism.RandomShapeGenerator;
import com.course.ch08.polymorphism.Shape;

//add a new type of Shape to Shapes.java and verify in main() that
//polymorphism works for your new type as it does in the old types
public class Exercise04 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[12];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }
    }
}
