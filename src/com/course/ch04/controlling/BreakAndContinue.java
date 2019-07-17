package com.course.ch04.controlling;

import static net.mindview.util.Print.print;
import static net.mindview.util.Range.range;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i==74) break;
            if(i%9!=0)continue;
            print(i+" ");
        }

        for(int i:range(100)){
            if(i==74) break;
            if(i%9!=0)continue;
            print(i+" ");
        }

        int i =0;
        while(true){
            i++;
            int j=i*27;
            if(j==1269)break;
            if(i%10!=0)continue;
            print(i+" ");
        }
    }
}
