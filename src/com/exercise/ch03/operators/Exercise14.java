package com.exercise.ch03.operators;

import static net.mindview.util.Print.print;

public class Exercise14 {
    static class Tank{
        int level;
    }
    static void  stringCompare(String x , String y){
        print("start compare....");
        if (x==y){
            print("x==y");
        }
        if(x!=y){
            print("x!=y");
        }
        if(x.equals(y)){
            print("x equals y");
        }
    }

    static void objectCompare(Tank tk1, Tank tk2){
        if (tk1.level == tk2.level){
            print("tk1.level = tk2.level");
        }

        if (tk1.equals(tk2)){
            print("equals");
        }
    }
    public static void main(String[] args) {
        String s1 = new String();
        s1 ="xyz";
        String s2 = new String();
        s2 = s1;
        stringCompare(s1,s2);
       String s3 = new String("zym");
       String s4 = new String("zym");
        stringCompare(s3,s4);

        Tank tk1 = new Tank();
        Tank tk2 = new Tank();
        tk1.level =15;
        tk2.level = 20;
        objectCompare(tk1,tk2);
        tk1=tk2;
        objectCompare(tk1,tk2);
        tk2.level=19;
        objectCompare(tk1,tk2);

     }
}
