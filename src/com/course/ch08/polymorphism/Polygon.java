package com.course.ch08.polymorphism;

import static net.mindview.util.Print.print;

public class Polygon extends Shape {
   @Override
    public void draw(){
       print("Polygon.draw()");
   }

    @Override
    public void erase() {
        print("Polygon.erase()");
    }
}
