package com.tji4.ch11.holdsobject;

import java.util.ArrayList;

/**
 * Created by eyifang on 2017/4/24.
 */

class Apple {
private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }

}

class Orange {



}

public class AppleAndOrangeWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args ){
        ArrayList apples = new ArrayList();
        for (int i=0;i<3;i++){
            apples.add(new Apple());
        }

        apples.add(new Orange());

        for(int i=0;i<apples.size();i++) System.out.println(((Apple) apples.get(i)).id());
    }
}
