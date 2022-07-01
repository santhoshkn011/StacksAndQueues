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
    //pop method
    void pop(){
        if (top == null){
            System.out.println("Stack is empty");
        }else {
            top = top.next;
        }
    }
    //peek method
    public void peek()
    {
        if (top != null) {
            System.out.println(top.data);
        }
        else {
            System.out.println("Stack is empty");
        }
    }
    //display method
    void display() {
        MyStack.Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
