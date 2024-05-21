package org.example;

public class MyLinkedList<T> {
    class MyNode<T> {
        public T value;

        public MyNode prev;
        public MyNode next;

        public MyNode(T value) {
            this.value = value;
            prev = null;
            next = null;
        }
    }

    private MyNode head;
    private MyNode tail;
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
            if(temp.value==(null)){
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public T get(int index) {
        MyNode temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        if(temp.value==(null)){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) temp.value;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        head = new MyNode<>(null);
        size = 0;
    }

    public void remove(int index) {
        MyNode temp = head;
        int counter = 1;
        if (counter - 1 == index) {
            head = temp.next;
            size--;
            return;
        }
        while (temp.next != null) {
            if (counter == index) {
                MyNode deleteNode = temp.next;
                temp.next = temp.next.next;
                deleteNode.next = null;
                size--;
            }
            temp = temp.next;
            counter++;
        }
    }
}
