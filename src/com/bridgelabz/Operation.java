package com.bridgelabz;

import java.util.Scanner;

public class Operation {
    MyStack.Node top = null;
// push method
    void push(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        MyStack.Node newNode = new MyStack.Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
    void display() {
        MyStack.Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
