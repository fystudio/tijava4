package com.course.ch03.operators;

import static net.mindview.util.Print.print;

public class ShortCircuit {
    static boolean test1(int val){
        print("test1("+val+")");
        print("result:"+(val<1));
        return val<1;
    }

    static boolean test2(int val){
        print("test1("+val+")");
        print("result:"+(val<2));
        return val<2;
    }

    static boolean test3(int val){
        print("test1("+val+")");
        print("result:"+(val<3));
        return val<3;
    }

    public static void main(String[] args){
        //true,true,true
        boolean b = test1(0)&&test2(1)&&test3(2);
        print("expression is b"+b);
        //true , false, true
        boolean c = test1(0)&&test2(4)&&test3(2);
        print("expression is c"+c);
        //true, false ,false
        boolean d = test1(0)&&test2(4)&&test3(4);
        print("expression is d"+d);
        //false,false,false
        boolean e = test1(4)&&test2(4)&&test3(4);
        print("expression is e"+e);
    }
}
