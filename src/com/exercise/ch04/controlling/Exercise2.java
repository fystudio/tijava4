package com.exercise.ch04.controlling;

import net.mindview.util.RandomGenerator;

import java.util.Random;
/** random.nextInt
 * **/
import static net.mindview.util.Print.print;
//random int values ?
public class Exercise2 {
   // static int result = (int) (Math.random()*100);

    public static void main(String[] args){
        Random randomc = new Random();
        int result = randomc.nextInt(100);
        for(int i=0;i<25;i++){
           // int random = (int)(Math.random()*100);
            int random = randomc.nextInt();
            if(result<random)
                print("generation:"+i+",first:"+result+",is less than second:"+random);
            else if(result>random)
                print("generation:"+i+",first:"+result+",is greater than second:"+random);
            else if(result==random)
                print("generation:"+i+",first:"+result+",is equal as second:"+random);
            result = random;
        }
    }
}

