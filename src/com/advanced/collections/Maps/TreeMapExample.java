package com.advanced.collections.Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(4,"c");
        map.put(3,"d");
        System.out.println(map);
    }
}
