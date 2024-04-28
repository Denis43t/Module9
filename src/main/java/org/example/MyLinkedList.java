package org.example;

import java.util.LinkedList;

public class MyLinkedList<T> {
    private MyNode head;
    private int size = 0;

    public void add(T data) {
        size++;
        MyNode toinsert = new MyNode(data);
        if (head == null) {
            head = toinsert;
            return;
        }
        MyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toinsert;

    }

    public void print() {
        MyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void get(int index) {
        MyNode temp = head;
        for (int i = 1; i <= index; i++) {
            if (i == index) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    public void size() {
        System.out.println(size);
    }

    public void clear() {
        head = new MyNode<>(null);
        size = 0;
    }

    public void remove(int index) {
        MyNode temp = head;
        int counter=1;
        if (counter-1==index){
            head=temp.next;
            return;
        }
        while (temp!=null && temp.next!=null){
            if (counter==index){
                MyNode deleteNode=temp.next;
                temp.next=temp.next.next;
                deleteNode.next=null;
            }
            temp=temp.next;
            counter++;
        }
    }
}
