package com.bridgelabz;

public class Operation {
    MyQueue front, rear;

    public Operation() {
        this.front = this.rear = null;
    }
    // Method to add a key to the queue.
    void enqueue(int data) {
        // Create a new LinkedList node
        MyQueue temp = new MyQueue(data);//object
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
}
