package com.exercise.ch06.access;

import com.course.ch06.access.Cookie;

public class Exercise5 extends  Cookie{
    void bee(){
        bite();
    }
    public static void main(String[] args) {
        Cookie ck = new Cookie();
        ck.chop();//can only access public
        Exercise5 e5 = new Exercise5();
        e5.bee();
        e5.bite();
    }
}
