package com.course.ch11.holdsobject;

import java.util.ArrayList;
/**
 * Created by eyifang on 2017/4/24.
 */
class Apple1 {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }

}

class Orange1 {
}

public class AppleAndOrangeWithGenerics {

    public static void main(String[] arsgs){
               ArrayList<Apple1> apples;
        apples = new ArrayList<Apple1> ();

        for(int i=0;i<3;i++){
            apples.add(new Apple1());
        }
    //apples.add(new Orange());

        for(Apple1 c:apples){
                System.out.println(c.id());
        }

    }
}
