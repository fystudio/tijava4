package com.exercise.ch11.holdsobject;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by eyifang on 2017/5/3.
 */
public class Exe05 {

    public static void main(String[] args) {
        List<Integer> alst = new ArrayList<Integer>();
        for (int i=1;i<11;i++){
            alst.add(new Integer(i));
        }
        print("1:"+alst);
        Integer i100 = new Integer(100);
        Integer i102 = new Integer(102);
        alst.add(i100);
        print("2:"+alst);
        print("3:"+ alst.remove(i102));
        print("4:"+ alst.remove(alst.indexOf(9)));
        print("5:"+ alst);
        List subList = alst.subList(2,5);
        print("6:"+ alst.containsAll(subList) );
        print("7:"+ alst.remove(subList));
        print("8:"+ alst);
        print("9:"+ alst.removeAll(subList));
        print("10:"+ alst);
        List<Integer> slst = new ArrayList<Integer>();
        for (int j=98;j>90;j--){
            slst.add(new Integer(j));
        }
        print("11:"+alst.addAll(slst));
        print("12:"+alst);
        Collections.sort(alst);
        print("13:"+alst);
    }

}
