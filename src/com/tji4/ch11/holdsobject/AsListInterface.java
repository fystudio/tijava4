package com.tji4.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by silver on 2017/4/25.
 */

class Snow {
    public String toString(){
        return "Snow";
    }

}

class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Powder{}
class Slush extends Snow{}

public class AsListInterface {
    public static void main (String[] args){

        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());

        for (Snow s1:snow1)
            System.out.println(s1);

        for (Snow s3:snow3)System.out.println(s3);
        for (Snow s4:snow4)System.out.println(s4);
    }
}
