package com.tji4exe.ch08.polymorphism;
/*
 * 在几何图形的示例中添加@Override注解
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
public class Exe02 {
	
	public static void main(String[] args){
		Shape s = new Triangle();
		s.draw();
		
	}

}

//Tringle.draw()
