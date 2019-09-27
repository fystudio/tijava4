package com.exercise.ch06.access;

import com.course.ch06.access.MyClass;

import static net.mindview.util.Print.print;

public class Exercise1 {
    protected void f1(){
        print("exercise1 f1()");
    }


    public static void main(String[] args) {
        MyClass mc = new MyClass();//package imported
    }
}

