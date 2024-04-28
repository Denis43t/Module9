package org.example;

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
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.remove(6);
        myLinkedList.print();
    }
}