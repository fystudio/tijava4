package com.exercise.ch11.holdsobject;

import java.util.*;

/**
 * Created by eyifang on 2017/5/4.
 */
public class Exe11 {
    public static void main(String[] args) {
        Collection al = new ArrayList();
        Collection hs = new HashSet();
        Collections.addAll(al);
        Collections.addAll(hs);
        Iterator it = Collections.emptyIterator();
        while(it.hasNext()) System.out.println(it.next().toString());
    }
}
