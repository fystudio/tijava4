package com.exercise.ch11.holdsobject;

/**
 * Created by eyifang on 2017/5/4.
 */
import typeinfo.pets.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Exe10 {
    public static void main(String[] args) {
        ArrayList<Rodent> rlst = new ArrayList<Rodent>();
        rlst.add(new Mouse());
        rlst.add(new Hamster());
        rlst.add(new Rat());

        Iterator<Rodent> it = rlst.iterator();
        while(it.hasNext()){
            Rodent rd = it.next();
            System.out.println(rd.toString());
        }
    }
}
