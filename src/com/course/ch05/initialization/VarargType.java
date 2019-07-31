package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class VarargType {
    static void f(Character... args){
        print( args.getClass());
        print("length "+args.length);
    }
    static void g(int... args){
        print(args.getClass());
        print(" length"+args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        print("int[]: "+new int[0].getClass());
    }
}
