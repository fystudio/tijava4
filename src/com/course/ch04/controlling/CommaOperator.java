package com.course.ch04.controlling;

import static net.mindview.util.Print.print;

public class CommaOperator {
    public static void main(String[] args) {
        for(int i =1,j=i+10;i<5;i++,j=i*2){
            print("i="+i+" j="+j);
        }
    }
}
