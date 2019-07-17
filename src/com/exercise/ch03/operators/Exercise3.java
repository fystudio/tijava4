package com.exercise.ch03.operators;

import static net.mindview.util.Print.print;

class Floate {
    Float val;
}
public class Exercise3 {
    static void fg(Floate v){
        v.val = 1f;
    }
    public static void main(String[] args){
        Floate f = new Floate();
        f.val = 16777215f;
        print(f.val);
        fg(f);
        print(f.val);
    }
}
