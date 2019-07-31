package com.course.ch05.initialization;

import sun.security.provider.ConfigFile;

import static net.mindview.util.Print.print;

public class Burrito {
    EnumOrder.Spiceiness degree;
    public Burrito(EnumOrder.Spiceiness degree){
        this.degree = degree;
    }
    public void describe(){
        print("This burrito is ");
        switch(degree){
            case NOT: print("not spicy at all");
            break;
            case MILD:
            case MEDIUM:print("a little hot");
            break;
            case HOT:
            case FLAMING:
            default: print("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(EnumOrder.Spiceiness.NOT),
                greenChile = new Burrito(EnumOrder.Spiceiness.MEDIUM),
                jalapeno = new Burrito(EnumOrder.Spiceiness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();

    }
}
