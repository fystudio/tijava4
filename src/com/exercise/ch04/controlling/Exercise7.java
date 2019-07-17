package com.exercise.ch04.controlling;

import static net.mindview.util.Print.print;

public class Exercise7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            print(i);
            if (i == 99) break;
        }
    }
}
