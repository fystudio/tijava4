package com.course.ch06.access;

import static net.mindview.util.Print.print;

public class ChocolateChip2 extends Cookie {
    public ChocolateChip2(){
        print("ChocolateChip2 constrocutor");
    }
    public void chomp(){bite();}

    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
