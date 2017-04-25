package com.tji4exe.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by eyifang on 2017/4/25.
 */

public class Exe02 {

    public static void main(String[] args) {
        Collection<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) set.add(i);
        for (Integer c : set) System.out.println(c);

    }
}
