package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class OverloadingOrder {
    static void f(String s, int i){
        print("String:"+s+",int: "+i);
    }
    static void f(int i, String s ){
        print("String:"+s+",int: "+i);
    }
    public static void main(String[] args) {
        f(1,"hello");
        f("nice",2);
    }
}
