package com.lambda;

import java.io.File;
import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by eyifang on 2017/5/2.
 */
public class Ex01 {

    public static void main(String[] args){


        File file = new File("C:/Users");
        //boolean isDir =  file.isDirectory();
        //if(isDir)System.out.println("is directory");


        Arrays.stream(file.listFiles()).forEach(System.out::println);
        print("+++++ then");

        File[] f= file.listFiles(s->s.isDirectory());
        for(File f1:f){print(f1.getName());}
    }
}
