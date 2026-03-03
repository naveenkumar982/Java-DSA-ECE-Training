package com.basics.strings.problems;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] arr1 = s1.toCharArray();//l,i,s,t,e,n
        char[] arr2 = s2.toCharArray();//s,i,l,e,n,t
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram found");
        }else  {
            System.out.println("Not a Anagram");
        }
    }
}
