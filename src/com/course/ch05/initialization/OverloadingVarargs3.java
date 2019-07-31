package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class OverloadingVarargs3 {

    static void f(float i,Character...args){
        print("first");
    }
    static void f(char c, Character... args){
        print("second");
    }
    public static void main(String[] args) {
        f(1,'a');
        f('a','b');
    }
}
