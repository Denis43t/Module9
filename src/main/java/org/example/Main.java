package org.example;

import java.util.HashMap;
import java.util.Map;
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
//        myLinkedList.add(4);
//        myLinkedList.remove(2);
//        myLinkedList.print();
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
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        map.put(1, 111);
        map.put(2, 222);
        map.put(null, 88888);
        map.put(null, 99999);
        System.out.println("map.remove(1) = " + map.remove(1));
        System.out.println("map.remove(2) = " + map.remove(2));
        System.out.println("map.remove(null) = " + map.remove(null));
        System.out.println("map.remove(4) = " + map.remove(4));
    }
}