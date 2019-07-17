package com.course.ch03.operators;

import static net.mindview.util.Print.print;

public class StringOperators {

    public static void main(String[] args) {
        int x=0, y=1,z=2;
        String s ="x,y,z";
        print(s+x+y+z);
        print(x+" "+s);// converts x to a String
        s+="(summed)=";
        print(s+(x+y+z));
        print(""+x);
    }
}
