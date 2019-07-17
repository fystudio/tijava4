package com.course.ch03.operators;

import static net.mindview.util.Print.print;

public class TernaryIfElse {
    static int ternary(int i){
        return i<10?i*100:i*10;
    }

    static int standIfElse(int i){
        if(i<10)
            return i*100;
        else
            return i*10;
    }
    public static void main(String[] args) {

        print(ternary(9));
        print(ternary(10));
        print(standIfElse(9));
        print(standIfElse(10));


    }

}
