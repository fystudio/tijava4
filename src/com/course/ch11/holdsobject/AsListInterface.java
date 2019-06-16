package com.course.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by silver on 2017/4/25.
 */

class Snow {
    public String toString(){
        return "Snow";
    }

}

class Powder extends Snow{
    public String toString(){
        return "Powder";
    }
}
class Light extends Powder{

    public String toString(){
        return "Light";
    }

}
class Heavy extends Powder{
    public String toString(){
        return "Heavy";
    }
}
class Crusty extends Powder{
    public String toString(){
        return "Crusty";
    }}
class Slush extends Snow{
    public String toString(){
        return "Slush";
    }}

public class AsListInterface {
    public static void main (String[] args){

        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());
        print("print s1:");
        for (Snow s1:snow1)
            System.out.println(s1);

        print("print s3:");
        for (Snow s3:snow3)System.out.println(s3);
        print("print s4:");
        for (Snow s4:snow4)System.out.println(s4);
    }
}
