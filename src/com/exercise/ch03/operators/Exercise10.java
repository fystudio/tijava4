package com.exercise.ch03.operators;

import static net.mindview.util.Print.print;

public class Exercise10 {
    public static byte getBitValue(byte source, int pos){
        return (byte)((source >>pos)&1);
    }

    public static void main(String[] args){

       int a=-15,b=15;
       print(Integer.toBinaryString(a));
       print(Integer.toBinaryString(~a));
       print(Integer.toBinaryString(b));
       print(Integer.toBinaryString(~b));
       //<<,>>
       print(Integer.toBinaryString(a>>2));
       print(b<<2);
        //&
        for (int i = 0; i < 10; i ++) {
            if ((i & 1) == 0) { // 偶数
                System.out.println(i);
            }
        }

        int c=1, d=2;
        c ^=d ;
        d ^=c;
        c ^=d;

        //~


    }
}
