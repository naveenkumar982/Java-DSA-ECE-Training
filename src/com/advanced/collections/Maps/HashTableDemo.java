package com.advanced.collections.Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(106,"Anushree");
        ht.put(117,"Punith");
        ht.put(128,"Likith");
        ht.put(102,"Naveen");
        ht.put(100,"Akash");
        ht.put(99,"Kavana");
        ht.put(98,"SheethalGowda");
        for(Map.Entry<Integer,String> entry:ht.entrySet()){
            System.out.println(entry.getKey()+"<-> "+entry.getValue());
        }
    }
}
