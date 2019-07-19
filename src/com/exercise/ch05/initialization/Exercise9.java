package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

public class Exercise9 {

    Exercise9(int number,String str2){
        this(str2);
        print("number is "+number
        );

    }

    Exercise9(String str){
        print("String is "+str);
    }

    public static void main(String[] args) {
       new  Exercise9(100,"super");
    }

}
