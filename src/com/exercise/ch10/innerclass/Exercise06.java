package com.exercise.ch10.innerclass;
/**
 * Exercise 6:
 * (2) Create an interface with at least one method, in its own package. Create a
 * class in a separate package. Add a protected inner class that implements the interface. In a
 * third package, inherit from your class and, inside a method, return an object of the
 * protected inner class, upcasting to the interface during the return.
 */

import com.course.ch10.innerclass.ToyInterface;

public class Exercise06 extends  ToyFactory{

    ToyInterface buyToy(){ return new Toy(); }

    public static void main(String[] args) {
        Exercise06 exe06 = new Exercise06();
        ToyInterface ty = exe06.buyToy();
        ty.move();
    }
}
