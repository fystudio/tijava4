package com.exercise.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by eyifang on 2017/5/3.
 */
public class Exe06 {

    static String next(){

        char cha0[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char cha1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        double index0 = Math.random()*cha0.length;
        char cha2  = cha0[(int)Math.round(index0)];
        String name = String.valueOf(cha2);
        char cha3[] = new char[4];
        for(int i=0;i<cha3.length;i++){
            int index;
            index = (int)(Math.random()*cha1.length);
            char cha4=cha1[(int)Math.round(index)] ;
            name = name + String.valueOf(cha4);
        }

        return name;
    }
    public static void main(String[] args) {

        List<String> alst = new ArrayList<String>();
        for (int i=1;i<11;i++){
            alst.add(next());
        }
        print("1:"+alst);
        String i100 = new String("Summer");
        String i102 = new String("Angie");
        alst.add(i100);
        print("2:"+alst);
        print("3:"+ alst.remove(i102));
        print("3.1:"+alst);
        print("4:"+ alst.remove(alst.indexOf(2)));
        print("5:"+ alst);
        List subList = alst.subList(2,5);
        print("6:"+ alst.containsAll(subList) );
        print("7:"+ alst.remove(subList));
        print("8:"+ alst);
        print("9:"+ alst.removeAll(subList));
        print("10:"+ alst);
        List<String> slst = new ArrayList<String>();
        for (int j=98;j>90;j--){
            slst.add(next());
        }
        print("11:"+alst.addAll(slst));
        print("12:"+alst);
        Collections.sort(alst);
        print("13:"+alst);
    }
}
