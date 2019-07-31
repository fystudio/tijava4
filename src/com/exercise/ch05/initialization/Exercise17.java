package com.exercise.ch05.initialization;

import java.lang.reflect.Array;

import static net.mindview.util.Print.print;

class Author{
    Author(String s){
        print(s);
    }
}
public class Exercise17 {

    public static void main(String[] args) {
        Author[] authors = new Author[]{new Author("J. K. Rowling"),new Author("Nietzsche"),new Author("Franz Kafka")};

    }

}
