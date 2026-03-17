package com.advanced.dsa.dataStructures.linear.queues;

public class IntegerQueue {
    private  static final int MAX_SIZE = 10;
    private  int[] arr = new int[MAX_SIZE];
    private  int front;
    private  int rear;
    IntegerQueue(){
        front = rear = -1; // Initially the queue is empty
    }
    public  boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public  boolean isFull(){
        return rear == MAX_SIZE -1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full.Can't add elements.");
            return;
        }
        if (isEmpty()){
            front = rear = 0;// Move front & read to the 0th index
        }
        else  {
            rear++; // If multiple elements add towards rear
        }
        arr[rear] = data;// In all cases we always add near the rear
        System.out.println("Enqueued " + data + " to the queue");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty.Can't dequeue.");
            return;
        }else if(front == rear){
            front = rear = -1;
        }else {
            front++;
        }
    }
    public  int getFront(){
        if(isEmpty()){
            System.out.println("Empty queue.No front element.");
            return -1;
        }
        return arr[front];
    }
    public  int getRear(){
        if(isEmpty()){
            System.out.println("Empty queue.No rear element.");
            return -1;
        }
        return arr[rear];
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return rear - front + 1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty queue.Nothing to display.");
            return;
        }
        System.out.println("The queue elements in FIFO order are:");
        for(int i = front; i <= rear; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        IntegerQueue queue = new IntegerQueue();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int x : arr) {
            queue.enqueue(x);
        }
        queue.display();
        System.out.println("Size of the queue is: " + queue.size());
        System.out.println("front element: " + queue.getFront());
        System.out.println("rear element: " + queue.getRear());
        System.out.println(queue.isEmpty());
    }
}
