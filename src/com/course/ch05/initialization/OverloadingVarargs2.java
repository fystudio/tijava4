package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class OverloadingVarargs2 {
    static void f(float i,Character...args){
        print("first");
    }
    static void f(Character... args){
        print("second");
    }

    public static void main(String[] args) {
        f(1,'a');
       // f('a','b');
    }
    //runtime compile error
}
