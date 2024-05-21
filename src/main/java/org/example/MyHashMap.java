package org.example;

import java.util.HashMap;

public class MyHashMap<T> {
    class MyNode<T> {
        public T value;
        public T key;
        public MyNode next;

        public MyNode(T key, T value) {
            this.value = value;
            this.key = key;
            next = null;
        }
    }

    private MyNode head;
    private int size = 0;

    private boolean keyChecker(T key) {
        MyNode temp = head;
        boolean chekedkey = false;
        while (temp.next != null) {
            if (temp.key.equals(key)) {
                chekedkey = true;
            }
            temp = temp.next;
        }
        return chekedkey;
    }

    public void put(T key, T value) {
        size++;
        MyNode toinsert = new MyNode(key, value);
        if (head == null) {
            head = toinsert;
            return;
        }
        MyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        if (temp.key.equals(toinsert.key)) {
            temp.value = value;
            size--;
        }
        else {
            temp.next = toinsert;
        }
    }

    public void print() {
        MyNode temp = head;
        while (temp != null) {
            System.out.println("value:" + temp.value + ", key:" + temp.key);
            temp = temp.next;
        }
    }

    public void remove(T key) {
        if (keyChecker(key) == false) {
            throw new ArrayIndexOutOfBoundsException();
        }
        MyNode temp = head;
        if (head.key.equals(key)) {
            head = temp.next;
            size--;
            return;
        }
        while (temp.next != null) {
            if (temp.key.equals(key)) {
                MyNode deleteNode = temp.next;
                temp.next = temp.next.next;
                deleteNode.next = null;
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    public void clear() {
        head = new MyNode<>(null, null);
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public T get(T key) {
        MyNode temp = head;
        while (!temp.key.equals(key)) {
            temp = temp.next;
        }
        if (!temp.key.equals(key)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) temp.value;
    }
}
