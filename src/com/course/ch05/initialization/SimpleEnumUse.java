package com.course.ch05.initialization;

import sun.security.provider.ConfigFile;

import static net.mindview.util.Print.print;

public class SimpleEnumUse {
    enum Spiceiness{
        NOT,MILD,MEDIUM,HOT,FLAMING
    }
    public static void main(String[] args) {
        Spiceiness howHot = Spiceiness.MEDIUM;
        print(howHot);
    }
}
