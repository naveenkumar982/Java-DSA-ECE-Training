package com.basics.strings;

public class StringConstantPool {
    static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);//these compares objects
        String s3 = new String("Java");
        System.out.println(s3 == s2);
        String s4 = new String("Java");
        System.out.println(s4 == s3);
        System.out.println(s2.equals(s4));//it is checking for value not for the object
    }
}
