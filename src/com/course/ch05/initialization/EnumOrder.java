package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

public class EnumOrder {
    enum Spiceiness{
        NOT,MILD,MEDIUM,HOT,FLAMING
    }

    public static void main(String[] args) {
        for(Spiceiness s : Spiceiness.values()){
            print(s+",ordinal "+s.ordinal());
        }
    }
}
