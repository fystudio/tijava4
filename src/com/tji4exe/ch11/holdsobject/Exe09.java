package com.tji4exe.ch11.holdsobject;

/**
 * Created by eyifang on 2017/5/4.
 */
import com.tji4.ch10.innerclass.Sequence;

import java.util.Iterator;

public class Exe09 {
    public static void main(String[] args) {

        Sequence  sequence = new Sequence(10);

        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

    }
}
