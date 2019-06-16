package com.course.ch11.holdsobject;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by silver on 2017/4/25.
 */
public class AddingGroups {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        print("print collection");
        for(Integer i :collection)System.out.println(i);
        print("print list");
        for(Integer j: list)System.out.println(j);
    }
}
