package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

class Rock {
    Rock(){
        print("Rock");
    }

}
public class SimpleConstructor{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Rock();
        }
    }
}