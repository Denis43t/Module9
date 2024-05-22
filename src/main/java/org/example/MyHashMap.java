package org.example;

import java.util.HashMap;

public class MyHashMap<K, V> {
    class MyNode<K, V> {
        public V value;
        public K key;
        public MyNode next;

        public MyNode(K key, V value) {
            this.value = value;
            this.key = key;
            next = null;
        }
    }

    private MyNode head;
    private int size = 0;

    public void put(K key, V value) {
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
        if (temp.key != null && temp.key.equals(toinsert.key)) {
            temp.value = value;
            size--;
        }
        else if (temp.key==null) {
            temp.value = value;
            size--;
        } else {
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

    public V remove(K key) {
        if (head==null){
            throw new ArrayIndexOutOfBoundsException();
        }
        V deletedStatment=null;
        MyNode temp = head;
        if (head!=null && head.key != null && head.key.equals(key)) {
            deletedStatment=(V)temp.value;
            head = temp.next;
            size--;
            return deletedStatment;
        }  if (head!=null && temp.key == null) {
            deletedStatment=(V)temp.value;
            head = temp.next;
            size--;
            return deletedStatment;
        }
        while (temp.next != null) {
            if (temp.next.key != null && temp.next.key.equals(key)) {
                deletedStatment=(V)temp.next.value;
                MyNode deleteNode = temp.next;
                temp.next = temp.next.next;
                deleteNode.next = null;
                size--;
                return deletedStatment;
            }
            if (temp.next.key == null) {
                deletedStatment=(V)temp.next.value;
                MyNode deleteNode = temp.next;
                temp.next = temp.next.next;
                deleteNode.next = null;
                size--;
                return deletedStatment;
            }
            temp = temp.next;
        }
        return deletedStatment;
    }

    public void clear() {
        head = new MyNode<>(null, null);
        size = 0;
    }

    public int size() {
        return this.size;
    }

    public V get(K key) {
        MyNode temp = head;
        while (temp!=null && temp.key != null && !temp.key.equals(key)) {
            temp = temp.next;
        }
        if (temp!=null && temp.key!=null && temp.key.equals(key)){
            return (V) temp.value;
        }
        if (temp!=null && temp.key==key){
            return (V) temp.value;
        }
        else {
            return null;
        }
    }
}
