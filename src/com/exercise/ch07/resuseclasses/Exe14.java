package com.exercise.ch07.resuseclasses;


/**
 * 
 * 在Car中的Engine添加一个service()方法
 * **/

class Engine {
	  public void start() {}
	  public void rev() {}
	  public void stop() {}
	  public void service(){}
	}

	class Wheel {
	  public void inflate(int psi) {}
	}

	class Window {
	  public void rollup() {}
	  public void rolldown() {}
	}

	class Door {
	  public Window window = new Window();
	  public void open() {}
	  public void close() {}
	}
public class Exe14 {
	Engine engine = new Engine();
	Wheel[] wheel = new Wheel[4];
	Door left = new Door();
	Door right = new Door();
	
	public Exe14(){
		
		for(int i=0;i<wheel.length;i++){
			wheel[i] = new Wheel();
		}
	}

	public static void main(String[] args){
		Exe14 car = new Exe14();
		car.left.open();
		car.left.close();
		car.left.window.rollup();
		car.engine.start();
		car.engine.service();
	}
}
