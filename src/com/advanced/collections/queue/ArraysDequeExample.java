package com.advanced.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArraysDequeExample {
    public static void main(String[] args) {
        //double ended queue
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("a");
        actions.addLast("b");
        actions.addLast("c");
        actions.addFirst("d");
        System.out.println("Actions : " + actions);
        actions.removeFirst();
        System.out.println("Actions : " + actions);
        actions.removeLast();
        System.out.println("Actions : " + actions);
    }
}
