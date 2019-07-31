package com.exercise.ch05.initialization;

import static net.mindview.util.Print.print;

class Currency{
    Exercise21.CURRENCY cuu;
    Currency(Exercise21.CURRENCY cu){
       this.cuu = cu;
    }
    public void describe(){
        switch (cuu) {
            case CNY:print("CHINA");break;
            case USD:print("US");break;
            case HKD:print("HONGKONG ");break;
            case JPY:print("JAPAN");break;
            case CAD:print("CANANDA");break;
        }
    }
}
public class Exercise22 {
    public static void main(String[] args) {
       Currency cha = new Currency(Exercise21.CURRENCY.CNY),
       cna = new Currency(Exercise21.CURRENCY.CAD),
       usd = new Currency(Exercise21.CURRENCY.USD);
       cha.describe();
       cna.describe();
       usd.describe();
    }
}
