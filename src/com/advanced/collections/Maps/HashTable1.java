package com.advanced.collections.Maps;

import java.util.Hashtable;

public class HashTable1 {
    static void main() {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(106,"Anushree");
        ht.put(117,"Punith");
        ht.put(128,"Likith");
        ht.put(102,"Naveen");
        ht.put(100,"Akash");
        ht.put(99,"Kavana");
        ht.put(98,"SheethalGowda");
        System.out.println(ht.getOrDefault(106,"Not found"));
        System.out.println(ht.getOrDefault(180,"Not found"));
        ht.putIfAbsent(90,"Bharath");
        System.out.println("Updated:" + ht);
        ht.putIfAbsent(102,"Saurav");//It will not get updated because it is already existing
        System.out.println("Updated:" + ht);
    }
}
