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
import java.util.Queue; //importing Queue
import java.util.LinkedList;

public class StacksAndQueues {
    //main method
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Welcome to Stacks and Queues Program.");
        //creating object for operation class
//        Operation operation = new Operation();//creating object
//        operation.enterQueue(56);
//        operation.enterQueue(30);
//        operation.enterQueue(70);
//        System.out.println("Queue Front data: " + operation.front.data);
//        System.out.println("Queue Rear data: " + operation.rear.data);
        //inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        queue.offer(56); //Setting Queue and inserting elements
        queue.offer(30);
        queue.offer(70);
        //The element() method in Java Queues is used to return the element at the front of the container and does not remove it.
        System.out.println("\nQueue head = " + queue.element());
        System.out.print("Removing element from queue = " + queue.remove());
        System.out.println("\nRemaining Queue elements...");
        Object remainingElements;
        //The poll() method of Queue Interface returns and removes the element at the front end of the container.
        while ((remainingElements = queue.poll()) != null) {
            System.out.println(remainingElements);
        }
    }
}

