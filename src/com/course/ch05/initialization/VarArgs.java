package com.course.ch05.initialization;

import static net.mindview.util.Print.print;
public class VarArgs {
    static void printArray(Object[] args){
        for(Object obj: args)
            print(obj+" ");
    }

    public static void main(String[] args) {
        printArray(new Object[]{
            new Integer(47), new Float(3.14),new Double(11.11)});
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}
