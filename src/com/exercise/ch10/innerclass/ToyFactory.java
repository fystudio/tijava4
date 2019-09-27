package com.exercise.ch10.innerclass;

import com.course.ch10.innerclass.ToyInterface;

import static net.mindview.util.Print.print;

public class ToyFactory {
    protected class Toy implements ToyInterface {
        Toy(){
            print("My name is Toy");
        }
        public void move() {
            print("I'm your new friend");
        }
    }
}
