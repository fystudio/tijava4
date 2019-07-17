package com.exercise.ch04.controlling;

import static net.mindview.util.Print.print;

public class Exercise3 {
    static boolean condition(int val ,int target){
        if (val>target)
        return true;
        else
            return false;
    };
    public static void main(String[] args) {

        while(condition(10,9))
            print("hello world");
    }
}
