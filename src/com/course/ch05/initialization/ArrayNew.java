package com.course.ch05.initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        print(Arrays.toString(a));
    }
}
