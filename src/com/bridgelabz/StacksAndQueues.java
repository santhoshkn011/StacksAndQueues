/*
Ability to create a Queue of
56->30->70
- Use LinkedList to do the Queue
Operations
- Here enqueue will internally call append
method on LinkedList.
- So 56 will be added first then 30 and
then 70 to make 56 on top of the Stack
 */
package com.bridgelabz;
import java.util.Scanner;

public class StacksAndQueues {
    //main method
    public static void main(String args[]) {
        System.out.println("Welcome to Stacks and Queues Program.");
        Operation operation = new Operation();//creating object
        operation.enqueue(56);
        operation.enqueue(30);
        operation.enqueue(70);
        System.out.println("Queue Front data: " + operation.front.data);
        System.out.println("Queue Rear data: " + operation.rear.data);
    }
}

