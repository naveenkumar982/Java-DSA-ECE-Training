package com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.toposort.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortBFSKhanCycleDetection {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[V+1];// 0-based indexing
        // Step 1 : Calculate the in-degree of all nodes
        for (int i =0; i<V ; i++){
            for(int neighbor : adj.get(i)){
                inDegree[neighbor]++;
            }
        }
        // Step 2 : do all nodes with in-degree 0 into the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i =0; i<V ; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        //Step 3 : Count the nodes processed in the Topo Sort
        int count = 0;
        while (!q.isEmpty()){
            int node = q.poll();
            count++;
            // reduce the indegree of the adjacent nodes
            // while reducing if in-Degree becomes 0, push to queue
            for(int neighbor : adj.get(node)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    q.add(neighbor);
                }
            }
        }
        // if all the nodes are processed, there is no cycle
        // if even one single node is not processed, there is a cycle
        return count != V;
    }

    static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        //We have to initialize with expty arrays
        for (int i =0; i< V ; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(2).add(2);
        TopologicalSortBFSKhanCycleDetection obj = new TopologicalSortBFSKhanCycleDetection();
        boolean ans = obj.isCyclic(V, adj);
        if (ans) {
            System.out.println("Cycle detected");
        }else  {
            System.out.println("Cycle not detected");
        }
    }
}
