package com.exercise.ch06.access;

import com.course.ch06.access.Cookie;

import static net.mindview.util.Print.print;
class Candy{
    protected void bite(){
        print("protected data");
    }
}
public class Exercise6 {
    public static void main(String[] args) {
       Candy cd = new Candy();
       cd.bite();//access protected in same file

       Exercise1 e1 = new Exercise1();
       e1.f1();//access protected in same package

        Cookie ck = new Cookie();
        //ck.bite();//can't access in another package
    }
}
