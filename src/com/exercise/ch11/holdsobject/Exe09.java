package com.exercise.ch11.holdsobject;

/**
 * Created by eyifang on 2017/5/4.
 */
import com.course.ch10.innerclass.Sequence;

public class Exe09 {
    public static void main(String[] args) {

        Sequence  sequence = new Sequence(10);

        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

    }
}
