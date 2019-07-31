package com.course.ch05.initialization;

import static net.mindview.util.Print.print;
class A{
    A(){
        print("I'm A");
    }

    @Override
    public String toString() {
        return "Override toString ";
    }
}
public class NewVarArgs {
    static void printArray(Object... args){
        for(Object obj:args)
            print(obj);
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14),new Double(11.11)});
        printArray(47,3.14F,11.11);
        printArray("one","two","three");
        printArray(new A(),new A(), new A());
        printArray((Object[]) new Integer[]{1,2,3,4});
        printArray();
    }
}
