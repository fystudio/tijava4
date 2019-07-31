package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class AutoboxingVarargs {
    public static void f(Integer... args){
        for(Integer i:args){
            print (i+" ");
        }
    }

    public static void main(String[] args) {
        f(new Integer(1),new Integer(2));
        f(4,5,6,7,8,9);
        f(10,new Integer(11),12);
    }
}
