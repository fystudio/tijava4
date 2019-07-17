package com.course.ch03.operators;

import static net.mindview.util.Print.print;

public class URShift {
    public static void main(String[] args){
        int i =-1;
        print("i:"+Integer.toBinaryString(i));
        i>>>=10;
        print("i>>>=10:"+Integer.toBinaryString(i));
        long l =-1;
        print("l:"+Long.toBinaryString(l));
        l>>>=10;
        print("l>>>=10:"+Long.toBinaryString(l));
        short s=-1;
        print("s:"+Integer.toBinaryString(s));
        s>>>=10;
        print("s>>>=10:"+Integer.toBinaryString(s));
        byte b=-1;
        print("b:"+Integer.toBinaryString(b));
        b>>>=10;
        print("b>>>10:"+Integer.toBinaryString(b));
        b=-1;
        print("b:"+Integer.toBinaryString(b));
        print("b:"+Integer.toBinaryString(b>>>10));
    }
}
