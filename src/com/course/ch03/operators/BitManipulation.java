package com.course.ch03.operators;

import java.util.Random;

import static net.mindview.util.Print.print;

public class BitManipulation {

    static void printBinaryInt(String s, int i){
        print(s+",int:"+i+",binary:\n"+Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l){
        print(s+",long:"+l+",binary:\n"+Long.toBinaryString(l));

    }

    public static void main(String[] args){
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();

      int maxpos = 2147483647;
      int maxneg = -2147483648;

      printBinaryInt("maxpos",maxpos);
      printBinaryInt("maxneg",maxneg);
      printBinaryInt("-1",-1);
      printBinaryInt("1",+1);
      printBinaryInt("i",i);
      printBinaryInt("~i",~i);
      printBinaryInt("-i",-i);
      printBinaryInt("j",j);
      printBinaryInt("i&j",i&j);
      printBinaryInt("i|j",i|j);
      printBinaryInt("i^j",i^j);
      printBinaryInt("i<<5",i<<5);
      printBinaryInt("i>>5",i>>5);
      printBinaryInt("(~i)>>5",(~i)>>5);
      printBinaryInt("i>>>5",i>>>5);
      printBinaryInt("(~i)>>>5",(~i)>>>5);

      //
        long l = rand.nextInt();
        long m = rand.nextInt();
        printBinaryLong("-1L",-1L);
        printBinaryLong("1L",1L);
        long ll = 9223372036854775807L;
        printBinaryLong("maxpos",ll);
        long lln = - 9223372036854775808L;
        printBinaryLong("maxneg",lln);
        printBinaryLong("l",l);
        printBinaryLong("~l",~l);
        printBinaryLong("-l",-l);
        printBinaryLong("m",m);
        printBinaryLong("l&m",l&m);
        printBinaryLong("l|m",l|m);
        printBinaryLong("l^m",l^m);
        printBinaryLong("l<<5",l<<5);
        printBinaryLong("m>>5",m>>5);
        printBinaryLong("(~l)>>5",(~l)>>5);
        printBinaryLong("l>>>5",l>>>5);
        printBinaryLong("(~l)>>>5",(~l)>>>5);

    }


}
