package com.advanced.dsa.dataStructures.linear.LinkedLists.singly;
class LL {
    Node head; //Starting node of the list -> only acess point
    private int size;
    LL() {
        size = 0;//Initially the list is empty so the size is zero;
    }
    public class Node {
        String data;// The data of the node -> String type
        Node next;// The address of the next node -> Node type

        Node(String data) {
            this.data = data;
            this.next = null;//Initially node is conneced to null
            size++;
        }

    }
    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        //Point the new node to the head
        newNode.next = head;
        //This new node is the new head of the list
        // Point the head to thus new node
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        // If head is empty head will point to null
        if(head==null){
            head=newNode;//The newNode becomes the head of the list
            return;
        }
        //For multiple elements - we need to finnd the last(tail) node
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty list -> Cannot remove head.");
            return;
        }
        //Single of multiple elements
        //for a single element -> if deleted -> head becomes null
        //For multiple elements -> if deleted -> head is the next  node
        head = this.head.next;
        size--;// reduce the size by one node
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list -> Cannot remove tail.");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node SecondLast = head;
        Node last = head.next;
        while(last.next!=null){
            SecondLast = last;
            last = last.next;
        }
        //After this loop is over , we will be at he correct
        // Second last & last nodes respectively
        SecondLast.next = null;
        size--;
    }
    public void DeleteNode(String Target){
        if(head==null){
            System.out.println("Empty list -> Cannot remove tail.");
            return;
        }
        //Case where head is the target
        if(head.data.equals(Target)){
            head = head.next;//Move the head to the next node
            size--;
            return;
        }
        //Case where the target is anywhere elsē in the list
        Node previous = null;
        Node current = head;
        while(current!=null &&!current.data.equals(Target)){
            previous = current;
            current = current.next;

        }
        if(current==null){
            System.out.println("Target Not found");
        }
            previous.next = current.next;
            size--;


    }
    static void main(String[] args) {
       LL sll = new LL();
       sll.addFirst("ECE");
       sll.addFirst("&");
        sll.addFirst("a");
        sll.addLast("java");
        sll.addLast("Training");
       sll.printlist();
       sll.removeFirst();
       sll.removeLast();
       sll.printlist();
       sll.DeleteNode("ECE");
       sll.printlist();
    }
}
