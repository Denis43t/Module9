package org.example;

public class MyNode<T> {
    public MyNode next;

    public T data;

    public MyNode(T data) {
        this.data = data;
        next = null;
    }
}
