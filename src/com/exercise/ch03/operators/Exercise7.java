package com.exercise.ch03.operators;

import java.util.Random;

import static net.mindview.util.Print.print;

public class Exercise7 {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i=0;i<10;i++){
            int flip = random.nextInt(2);
            if(flip==0){
                print("head");
            }else
            {
                print("literal");
            }
        }

    }
}
