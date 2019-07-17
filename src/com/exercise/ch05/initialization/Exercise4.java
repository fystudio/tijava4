package com.exercise.ch05.initialization;

public class Exercise4 {
    Exercise4(int i){
        System.out.println("not default:"+i);
    }

    public static void main(String args[]){
        new Exercise4(5);
    }
}
