package com.basics.garbagecollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj = new GCDemo();
        obj = null;
        System.gc();
        // Now a days the gc() method is automatically called after program execution by the Object class for clutter, garbage collection & removal by the JVM
        //  We dont need to do it
        System.out.println("Naveen");
    }
}