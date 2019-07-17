package com.exercise.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by eyifang on 2017/4/25.
 */

class Sequence{
    public Sequence(){

    };

    public String toString(){
        return "Sequence" ;
    }
}
public class Exe03 {

    public static void main(String[] args){
        Collection<Sequence> list = new ArrayList<Sequence>();
        Collection<Sequence> set = new HashSet<Sequence>();
        for(int i=0;i<10;i++)list.add(new Sequence());
        for(int i=0;i<10;i++)set.add(new Sequence());
        System.out.println("printing list:");
        for(Sequence l :list) System.out.println(l);
        System.out.println("printing set:");
        for(Sequence s:set)System.out.println(s);
    }
}
