package com.course.ch05.initialization;

import com.course.ch03.operators.Bool;

import static net.mindview.util.Print.print;

class Book {
    boolean checkedOut =false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut =false;
    }
    protected  void finalize(){
        if(checkedOut){
            print("error, checked out ");
           //super.finalize();
        }
    }
}

public class TerminationCondition{
    public static void main(String[]args){
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
