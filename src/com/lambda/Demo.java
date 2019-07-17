package com.lambda;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by eyifang on 2017/5/2.
 */
public class Demo {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("eyifang");
        list.add("eqinson");
        list.add("ezhahui");

        list.removeIf(s->s.equals("eyifang"));

       // for(String c :list){
        //   System.out.println(c) ;
       // }
       // list.forEach(System.out::println);
       // list.stream().map(String::toUpperCase).forEach(System.out::println);


} }
