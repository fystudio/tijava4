package com.course.ch05.initialization;

import static net.mindview.util.Print.print;

class Other{
    public static void main(String[] args) {
        for(String s:args){
            print(s+" ");
        }
    }
}
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle","de","dum"});
    }
}
