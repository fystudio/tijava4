package com.exercise.ch06.access;

import com.course.util.access.debug.Debug;

public class Exercise3 {
    public static void main(String[] args) {
        Debug d1 = new Debug();
        com.course.util.access.debugoff.Debug d2 = new com.course.util.access.debugoff.Debug();
        d1.debug("hi");
        d2.debug();
    }
}
