package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

class Rock2{
    Rock2(int i){
        print("Rock"+i);
    }
}
public class SimpleConstructor2 {
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            new Rock2(i);
        }
    }
}
