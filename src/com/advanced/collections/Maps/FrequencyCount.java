package com.advanced.collections.Maps;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        System.out.println("Count of 4: " + map.get(4));
    }
}
