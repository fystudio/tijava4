package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class OverloadingVarargs {
    static void f(Character... args){
        print("first");
        for(Character c:args){
            print(" "+c);
        }
    }
    static void f(Integer... args){
        print("second");
        for(Integer i:args)
            print(" "+i);
    }
    static void f(Long... args){
        print("third");
    }

    public static void main(String[] args) {
        f('a','b','c');
        f(1);
        f(2,1);
        f(0);
        f(0L);
    }
}
