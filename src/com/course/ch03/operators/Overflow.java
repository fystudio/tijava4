package com.course.ch03.operators;

import net.mindview.util.Print;

import static net.mindview.util.Print.print;

public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        print("big="+big);
        int bigger = big*4;
        print("bigger="+bigger);
    }
}
