package org.example;

import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        MyArrayList my = new MyArrayList(8);
//        my.add(0);
//        my.add(1);
//        my.remove(0);
//        my.remove(1);
//        System.out.println("my.get(0) = " + my.get(1));
//        System.out.println(my.size());
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        myLinkedList.clear();
//        myLinkedList.get(0);
//        MyQueue queue = new MyQueue(3);
//        queue.add(3);
//        queue.add(2);
//        queue.add(1);
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.poll() = " + queue.poll());
//        System.out.println("queue.poll() = " + queue.poll());

//        MyStack myStack = new MyStack<>(5);
//        myStack.push(1);
//        myStack.push(2);
//        System.out.println("myStack.pop() = " + myStack.pop());
//        System.out.println("myStack.pop() = " + myStack.pop());
//        System.out.println("myStack.peek() = " + myStack.peek());
        MyHashMap myHashMap=new MyHashMap();
        myHashMap.put(1,123);
        myHashMap.put(1,124);
        myHashMap.put(2,126);
        myHashMap.put(3,326);
        myHashMap.put(5,526);
        myHashMap.print();
        System.out.println("myHashMap.size() = " + myHashMap.size());
    }
}