/*
Ability to create a Stack of 56->30->70
- Use LinkedList to do the Stack Operations
- Here push will internally call add method
on LinkedList.
- So 70 will be added first then 30 and
then 56 to make 56 on top of the Stack
 */
package com.bridgelabz;
import java.util.Scanner;

public class StacksAndQueues {
    //main method
    public static void main(String args[]){
        System.out.println("Welcome to Stacks and Queues Program.");
        int choose;
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();
        do {
            System.out.println("Enter the options:\n1. To push the data\n2. Display the Stack\n3. To exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operation.push(sc); //calling method to push the data
                    break;
                case 2:
                    operation.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter invalid input");
                    break;
            }
        }while (choose != 3);
    }
}

