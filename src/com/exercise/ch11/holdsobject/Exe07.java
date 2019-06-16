package com.exercise.ch11.holdsobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by eyifang on 2017/5/3.
 */
interface Juice {}
class Orange implements  Juice{

  public String toString(){
       return "Orange";
   }
}
class Apple implements Juice{
    public String  toString (){
        return "Apple";
    }
}
class Mango implements Juice {
    public String toString(){
        return "Mango";
    }
}
class Banana implements Juice{
    public String toString(){
        return "Banana";
    }
}
public class Exe07 {
    public static void main(String[] args) {
        List<Juice> lst = new ArrayList<Juice>(Arrays.asList(new Orange(),new Banana(),new Apple(),new Mango(),new Orange()));
        lst.forEach(System.out::println);
        List<Juice> subList = lst.subList(3,5);
        print("2:"+lst.containsAll(subList));
        print("3:"+lst.removeAll(subList));
        lst.forEach(System.out::println);
    }

}
