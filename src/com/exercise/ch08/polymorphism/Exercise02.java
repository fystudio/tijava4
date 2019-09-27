package com.exercise.ch08.polymorphism;
/*
 * iadd the @Override annotation to the shapes example
 */
import static net.mindview.util.Print.print;

class Shape{
	public void draw(){
		print("shape.draw()");
	}
	
	public void erase(){
		print("shape.draw()");
	}
}

class Triangle extends Shape{
	@Override
	public void draw(){
		print("Tringle.draw()");
	}
}
public class Exercise02 {
	
	public static void main(String[] args){
		Shape s = new Triangle();
		s.draw();
		
	}

}

//Tringle.draw()
