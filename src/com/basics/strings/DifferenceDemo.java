package com.basics.strings;

public class DifferenceDemo {
    static void main(String[] args) {
        String s = "Java";
        System.out.println("String before:" + s.hashCode());
        s= s+" DSA";
        System.out.println("String after:" + s.hashCode());
        // This proves that strings are IMMUTABLE
//        for (int i = 0; i < 10000000; i++) {
//            s = s+" DSA";
//        }
        //This is bad because it will create 1000 new obje
        //cts
        // To do this we have two special MUTABLE Strings
        //StringBuffer & StringBuilder -> java.lang
        StringBuilder builder = new StringBuilder("Java");
        System.out.println("Builder before:" + builder.hashCode());
        builder.append("DSA");
        System.out.println("Builder after:" + builder.hashCode());
    }
}
