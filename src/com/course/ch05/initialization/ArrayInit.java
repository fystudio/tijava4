package com.course.ch05.initialization;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a={new Integer(1),new Integer(2),3};
        Integer[] b = {new Integer(1),new Integer(2),3};
        print(Arrays.toString(a));
        print(Arrays.toString(b));
    }
}
