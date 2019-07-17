package com.exercise.ch03.operators;

import static net.mindview.util.Print.print;

public class Exercise6 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf!";

        Dog d3 = new Dog();
        d3 = d1;
        print("d1 equals d3:" + d3.equals(d1));
        print("d1==d3:" + (d1 == d3));
    }
}
