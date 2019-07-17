package com.course.ch04.controlling;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
import static net.mindview.util.Range.range;

public class ForEachInt {
    public static void main(String[] args) {
        for(int i:range(10))
            printnb(i+" ");
        print();
        for(int i:range(5,10))
            printnb(i+" ");
        print();
        for(int i: range(5,20,3))
            printnb(i+" ");
        print();
    }
}
