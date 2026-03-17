package com.advanced.dsa.dataStructures.linear.queues;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    static void generateBinaryNumber(int n)
    {
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while(n-- > 0){
            String curr = q.poll();//Pop
            System.out.print(curr + " ");//Print
            q.offer(curr + "0");//Concatenate 0 & push to queue
            q.offer(curr + "1");//Concatenate 1 & push to queue
        }
        System.out.println();// offer = add, poll = remove(pop)
    }

    static void main(String[] args) {
        int n = 6;
        generateBinaryNumber(n);
    }
}
