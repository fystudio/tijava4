package com.exercise.ch11.holdsobject;

import java.util.*;
import static net.mindview.util.Print.print;
/**
 * Created by eyifang on 2017/4/27.
 */

/**
 *  几个collection的区别
 *  Math函数
 */
class movie {

    public movie(){

       System.out.println(next());
    }

    private String next(){

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
}
public class Exe04 {

    static void fill(Collection<movie> c){
        c.add(new movie());
        c.add(new movie());
        c.add(new movie());
        c.add(new movie());
        c.add(new movie());
    }
    public static void main(String[] args){

        print("print ArrayList");
        fill( new ArrayList<movie>());
        print("print LinkedList");
        fill(new LinkedList<movie>());
        print("print HashSet");
        fill(new HashSet<movie>());
        print("print LinkedHashSet");
        fill(new LinkedHashSet<movie>());
       // print("print TreeSet");
       // fill(new TreeSet<movie>());
    }
}
