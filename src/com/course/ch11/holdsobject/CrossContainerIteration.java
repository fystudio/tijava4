package com.course.ch11.holdsobject;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by eyifang on 2017/5/4.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while(it.hasNext())
        {
        Pet p = it.next();
        System.out.println(p.id()+":"+p+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petsHS = new HashSet<>(pets);
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}
