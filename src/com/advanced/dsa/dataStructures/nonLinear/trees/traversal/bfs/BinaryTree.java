package com.advanced.dsa.dataStructures.nonLinear.trees.traversal.bfs;

import com.advanced.dsa.dataStructures.nonLinear.trees.traversal.dfs.Node;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){

        this.data=data;
        this.left = this.right = null;

    }
}

public class BinaryTree {
     public static void levelOrderTraversalOrBFS(TreeNode root) {
         //Base case // Corner case // Edge case
         if (root == null) {
             return;
         }
         //You are pushing nodes not numbers
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         while (!queue.isEmpty()) {
             TreeNode temp = queue.poll();
             System.out.print(temp.data + " ");
             //left subtree
             if (temp.left != null) {
                 queue.add(temp.left);
             }
             //right subtree
             if (temp.right != null) {
                 queue.add(temp.right);
             }
         }
         System.out.println();
     }
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("BFS :" + " ");
        levelOrderTraversalOrBFS(root);
    }
}
