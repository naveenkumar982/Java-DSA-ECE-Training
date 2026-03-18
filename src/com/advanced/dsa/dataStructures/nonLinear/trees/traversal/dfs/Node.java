package com.advanced.dsa.dataStructures.nonLinear.trees.traversal.dfs;

public class Node {
    int data;// The data of the node
    Node left;// The address of the left child
    Node right;// The address of the right child
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;//Node has no children initially
    }
    public static void preorder(Node root) {// DLR
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root) {// LDR
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void postorder(Node root) {// LRD
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    static void main(String[] args) {
        //Construct the binary tree
        //We must construct the tree from Top -> Bottom, left -> Right, Level by level
        //level- 0
        Node root = new Node(1);
        //level 1
        root.left = new Node(2);
        root.right = new Node(3);
        //level 2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //level 3
        root.left.right.left = new Node(9);
        root.right.right.left = new Node(15);

        System.out.println("Preorder traversal  : " +  " ");
        preorder(root);
        System.out.println();
        System.out.println("Inorder traversal : " +  " ");
        inorder(root);
        System.out.println();
        System.out.println("Postorder traversal :" +  " ");
        postorder(root);

    }
}
