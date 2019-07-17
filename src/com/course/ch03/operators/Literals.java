package com.course.ch03.operators;

import static net.mindview.util.Print.print;

public class Literals {

    public static void main(String[] args){
        int i1 = 0x2f; //Hexadecimal
        print("i1:"+Integer.toBinaryString(i1));
        int i2 = 0x2F;
        print("i2:"+Integer.toBinaryString(i2));
        int i3=0177;//Octal
        print("i3:"+Integer.toBinaryString(i3));
        char c = 0xffff;//max char hex value
        print("c:"+Integer.toBinaryString(c));
        byte b = 0x7f;//max byte hex value
        print("b:"+Integer.toBinaryString(b));
        short s = 0x7fff;//max short hex value
        print("s:"+Integer.toBinaryString(s));
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 =1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1d;
        double d2 = 1D;
    }
}
