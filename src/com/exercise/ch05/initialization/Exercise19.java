package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

public class Exercise19 {
    static void s(String... args){
        for(String s:args){
        print(s);}
    };

    public static void main(String[] args) {
        s("hello","what","um...");
        s(new String[]{"a","b","c"});
    }
}
