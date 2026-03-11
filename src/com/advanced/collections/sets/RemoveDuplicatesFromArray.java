package com.advanced.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int [] array = {1,2,5,6,5,4,6,7,8,7,9,1};
        System.out.println(Arrays.toString(array));
        Set<Integer> UniqueElements = new HashSet<>();
        for(int x : array){
            UniqueElements.add(x);
        }
        System.out.println(" Unique Elements are: "+UniqueElements);
        Set<Integer> NonDuplicates = new HashSet<>();
        NonDuplicates.addAll(Arrays.asList(1,2,5,6,5,4,6,7,8,7,9,1));
        System.out.println(" NonDuplicates are: "+NonDuplicates);
    }
}
