package com.course.ch06.access;

import static net.mindview.util.Print.print;

public class Cookie {
    public Cookie(){
        print("Cookie constructor");
    }
    public void chop(){
        print("chop");
    }
    protected void bite(){
        print("bite");
    }

    private void smash(){
        print("smash");
    }

}
