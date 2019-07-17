package com.course.ch03.operators;

import java.util.Random;

import static net.mindview.util.Print.print;
//mathematical operators
public class MathOps {
    public static void main(String[] args){
        Random rand = new Random(47);
        int i,j,k;
        j = rand.nextInt(100) +1;
        print("j:"+j);
        k = rand.nextInt(100)+1;
        print("k:"+k);
        i = j+k;
        print("j+k:"+i);
        i=j-k;
        print("j-k:"+i);
        i=k/j;
        print("k/j:"+i);
        i=k*j;
        print("k*j:"+i);
        i=k%j;
        print("k%j:"+i);

        float x,y,z;
        y = rand.nextFloat();
        z = rand.nextFloat();
        x = y+z;
        print("y+z:"+x);
        x=y-z;
        print("y-z:"+x);
        x=y*z;
        print("y*z:"+x);
        x=y/z;
        print("y/z:"+x);
        x=y%z;
        print("y%z:"+x);

    }
}
