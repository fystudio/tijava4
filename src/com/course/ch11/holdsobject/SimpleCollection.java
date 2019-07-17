package com.course.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by eyifang on 2017/4/25.
 */
public class SimpleCollection {
    public static void main(String[] args){

        Collection<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<10;i++)list.add(i);

        for(Integer c:list) System.out.println(c);


    }


}
