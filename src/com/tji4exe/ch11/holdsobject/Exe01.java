package com.tji4exe.ch11.holdsobject;

import java.util.ArrayList;

/**
 * Created by silver on 2017/4/24.
 */
 class Gerbil {
    public static int i = 0;

    public Gerbil() {

    }

    int gerbilNumber() {

        i++;
        return i;
    }

    public void hop() {
        System.out.println("Gerbil+" + gerbilNumber() + ":hops");
    }

}

   public  class Exe01{

    public static void main(String[] args){
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        for(int i=0;i<10;i++){
            gerbils.add(new Gerbil());

        }

        for(Gerbil g:gerbils) g.hop();
    }
}
