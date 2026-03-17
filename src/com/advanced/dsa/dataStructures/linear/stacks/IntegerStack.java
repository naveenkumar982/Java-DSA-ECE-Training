package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class IntegerStack {
    public static  void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(2);
        integerStack.push(4);
        System.out.println(integerStack.peek());
        System.out.println(integerStack.empty());
        System.out.println(integerStack.size());
    }
}
