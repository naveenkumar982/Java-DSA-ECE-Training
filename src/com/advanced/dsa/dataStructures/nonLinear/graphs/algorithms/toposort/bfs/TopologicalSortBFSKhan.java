package com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.toposort.bfs;

import com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.toposort.dfs.TopologicalSortDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortBFSKhan {
    public List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[V];
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
        //Step 3 : BFS Call
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()){
            int node = q.poll();
            topo.add(node);// Store it in the answer (top sort)
            // reduce the indegree of the adjacent nodes
            // while reducing if in-Degree becomes 0, push to queue
            for(int neighbor : adj.get(node)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    q.add(neighbor);
                }
            }
        }
        return topo;
    }

    static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        //We have to initialize with expty arrays
        for (int i =0; i< V ; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortBFSKhan obj = new TopologicalSortBFSKhan();
        List<Integer> ans = obj.topoSort(V, adj);
        System.out.print("The TopSort Linear Ordering (BFS) u --> v is : ");
        for (int node : ans){
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
