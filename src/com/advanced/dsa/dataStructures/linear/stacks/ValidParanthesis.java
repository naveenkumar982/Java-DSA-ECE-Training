package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class ValidParanthesis {
    static boolean isValidParanthesis(String str) {
        Stack<Character> s = new Stack<>();
        // "{[()]}" --> '{' '[' '(' ')' ']' '}];
        for (char c : str.toCharArray()) {
            if(c=='(' || c=='[' || c=='{') {
                s.push(c);//Push opening braces to the stack
            }else{
                if(s.isEmpty()) {
                    return false;
                }
                char top = s.pop();
                if(c == '}' && top!='{') return false;
                if(c == ']' && top!='[') return false;
                if(c == ')' && top!='(') return false;
            }
        }
        //if the string is a valid paranthesis if all the brackets are removed
        //It is invalid if one character is present in it
        // This will happen when there are mismatched brackets
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "[(]{[()]}";
        String s3 = "{{[(";
        System.out.println(s1 + " -> " + (isValidParanthesis(s1) ? "Valid" : "Invalid"));
        System.out.println(s2 + " -> " + (isValidParanthesis(s2) ? "Valid" : "Invalid"));
        System.out.println(s3 + " -> " + (isValidParanthesis(s3) ? "Valid" : "Invalid"));
    }
}
