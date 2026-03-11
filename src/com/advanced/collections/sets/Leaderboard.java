package com.advanced.collections.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Leaderboard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder()
        );
        scores.add(100);
        scores.add(28);
        scores.add(389);
        scores.add(254);
        scores.add(589);
        scores.add(126);
        scores.add(709);
        scores.add(18);
        System.out.println("Scores: "+scores);
    }
}
