package org.example;

import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        MyArrayList my = new MyArrayList(8);
//        my.add(3);
//        my.add(2);
//        my.add(3);
//        my.add(2);
//        my.add(3);
//        my.add(2);
//        my.add(3);
//        my.add(2);
//        my.add(2);
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        myLinkedList.add(4);
//        myLinkedList.add(5);
//        myLinkedList.add(6);
//        myLinkedList.add(7);
//        myLinkedList.remove(1);
//        myLinkedList.print();
//        MyQueue queue = new MyQueue(3);
//        queue.add(3);
//        queue.add(2);
//        queue.add(1);
//        queue.sout();
//        queue.peek();
//        System.out.println("-------");
//        queue.poll();
//        System.out.println("----");
//        queue.sout();
//        MyStack myStack = new MyStack<>(5);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.push(5);
//        myStack.push(6);
//        myStack.sout();
        MyHashMap myHashMap=new MyHashMap();
        myHashMap.add(1,123);
        myHashMap.add(1,124);
        myHashMap.add(2,126);
        myHashMap.add(3,326);
        myHashMap.add(5,526);
        myHashMap.print();
        System.out.println("===");
        myHashMap.remove(1);
        myHashMap.print();
        myHashMap.size();
        myHashMap.get(2);
    }
}