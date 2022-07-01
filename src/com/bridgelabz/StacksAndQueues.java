/*
Ability to peak and pop from the Stack till it is empty 56 ->30 ->70
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
            System.out.println("Enter the options:\n1. To push the data\n2. Pop the data" +
                    "\n3. Peek the element\n4. To display\n5. To exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    operation.push(sc); //calling method to push the data
                    break;
                case 2:
                    operation.pop(); //pop the top element
                    break;
                case 3:
                    operation.peek(); //peek the top element
                    break;
                case 4:
                    operation.display(); //display the stack
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter invalid input");
                    break;
            }
        }while (choose != 3);
    }
}

