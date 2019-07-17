package com.course.ch03.operators;

import static net.mindview.util.Print.print;

public class Casting {
    public static void main(String[] args) {
        int i =200;
        long lng =(long)i;
        print(lng);
        lng =i;
        print(lng);
        long lng2 =(long)200;
        print(lng2);
        lng2=200;
        i=(int)lng2;
        print(i);

    }
}
