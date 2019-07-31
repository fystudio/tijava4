package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

public class Exercise21 {
    enum CURRENCY{
        CNY,USD,EUR,JPY,CAD,HKD
    }
    public static void main(String[] args) {
        for(CURRENCY cu: CURRENCY.values()){
            print(cu+","+cu.ordinal());
        }
    }
}
