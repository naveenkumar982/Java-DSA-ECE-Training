package com.basics.garbagecollection;

public class GCExample {
    public static void main(String[] args) {
        String s1 = new String("Akash");
        String s2 = new String("Naveen");
        s1 = s2;
        //System.gc();//We wrote this in prevoius versions
        //Now it is not mandatory
        //Now, int the SCP -> "Akash" is not available
        //This proves that garbage Collection is Automatic
        // Any unused data is cleared = garbage Collection
        System.out.println(s1);
    }
}
