package com.advanced.collections.Maps;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    //Remove some values in a liat using Iterator
    //The Iterator  is an Interface in Collections Library in Java
    //It is used to navigate & perform certain operations
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(13);
        numbers.add(5);
        numbers.add(2);
        System.out.println("Before removing: " + numbers);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println("After removing: "+numbers);
    }
}
