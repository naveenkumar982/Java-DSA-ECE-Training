package com.basics.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Tripillar Solutions";
        System.out.println("length: " + str.length());
        System.out.println("Char at index 2: " + str.charAt(2));
        System.out.println("Char at last index: " + str.charAt(str.length()-1));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(0,3));
        System.out.println("Equals: "+str.equals("Tripillar Solutions"));
        System.out.println("Equals[Cases doesnt matter]:" + str.equalsIgnoreCase("Tripillar solutions"));
        String jumbled = "Akash1is1topper1of1the1class";
        String[] words = jumbled.split("1");
        System.out.println(words[0]);
        String name = "      Akash j       ";
        System.out.println(name.trim());//remove spaces from start and end;
        char[] letters = {'L', 'i','k','i','t','h'};
        String word = new String(letters);
        System.out.println(word);

    }
}
