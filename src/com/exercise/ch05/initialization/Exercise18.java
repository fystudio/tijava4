package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

class Writer{
    Writer(String s){
        print(s);
    }
}
public class Exercise18 {
    public static void main(String[] args) {
        Writer[] writers = new Writer[]{new Writer("J. K. Rowling"),new Writer("Nietzsche"),new Writer("Franz Kafka")};
        Writer[] fakers = writers;
        print(fakers.length);
    }
}
