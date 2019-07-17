package com.course.ch02.objects;

import static net.mindview.util.Print.print;

public class HelloWorld {

    //manipulate objects with references
    //reference not object
    String s;
    String s1 ="asdf";
    //create all the objects
    String s2 = new String("asdf");
    //where the storage lives
    //register , stack , the heap,
    //primitive types and wrapper type
    char c = 'x';
    Character ch = new Character(c);
    Character ch1 = new Character('x');

    boolean b = false;
    Boolean bh = new Boolean(b);
    Boolean bh1 = new Boolean(false);

    //scoping
    {
        int x = 12;
        //only x available
        {
            int q = 96;
            //both x & q available
        }
        // only x available
        // q is "out of scope"
    }

    class ATypeName {}
    ATypeName a = new ATypeName();

    class DataOnly {
        int i;
        double d;
        boolean b;

    }

    DataOnly data = new DataOnly();

    public static void main(String... args) {
        print("hello");
    }

}
