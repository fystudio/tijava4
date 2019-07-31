package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

class Test{
    public static void main(String... args) {
       for(String arg:args){
           print(arg);
       }
    }
}
public class Exercise20 {
    public static void main(String[] args) {
         new Test().main("what","omg","noway");
    }
}
