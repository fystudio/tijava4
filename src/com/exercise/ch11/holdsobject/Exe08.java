package com.exercise.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by eyifang on 2017/5/4.
 */
public class Exe08 {
    public static void main(String[] args) {

        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        for(int i=0;i<10;i++){
            gerbils.add(new Gerbil());

        }
       Iterator<Gerbil> it = gerbils.iterator();
        while(it.hasNext()){
            Gerbil gb = it.next();
            gb.hop();
        }
    }
}
