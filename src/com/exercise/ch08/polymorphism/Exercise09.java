package com.exercise.ch08.polymorphism;

import static net.mindview.util.Print.print;

class Rodent {
	protected void bite() {
		print("Rodent.bite");
	}
	protected void dig() {
		print("Rodent.dig");
	}
}

class Mouse extends Rodent {

	public void bite() {
		print("Mouse.bite");
	}
	public void dig() {
		print("Mouse.dig");
	}
	public void eat(){
		print("Mouse.eat");
	}
}

class Gerbil extends Rodent {
	public void bite() {
		print("Gerbil.bite");
	}
	public void dig() {
		print("Gerbil.dig");
	}
	public void run(){
		print("Gerbil.run");
	}
}

class Hamster extends Rodent {
	public void bite() {
		print("Hamster.bite");
	}
	public void dig() {
		print("Hamster.dig");
	}
	public void roll(){
		print("Hamster.roll");
	}
}

public class Exercise09 {
	
	public static void printAll(Rodent[] rods){
		for(Rodent r:rods){
			r.bite();
			r.dig();
		}
	}
	
	public static void main(String[] args){
		Rodent[] rodents = {new Hamster(),new Gerbil(),new Mouse(), new Rodent()};
		printAll(rodents);
	}

}
