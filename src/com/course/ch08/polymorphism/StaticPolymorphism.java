package com.course.ch08.polymorphism;

import static net.mindview.util.Print.print;

class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        print(sup.staticGet());
        print(sup.dynamicGet());
    }
}
