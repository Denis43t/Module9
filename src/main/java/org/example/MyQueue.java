package org.example;

import java.util.Arrays;

public class MyQueue<T> {

    private T[] array;
    private int size;
    private int index = 0;

    //initialization array
    public MyQueue(int size) {
        this.array = (T[]) new Object[size];
        this.size = size;
    }

    private void grow() {
        if (size == 0) {
            size++;
        } else {
            size *= 2;
        }
        array = Arrays.copyOf(this.array, size);
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }

    public void add(T value) {
        if (size <= index) {
            grow();
        }
        array[index] = value;
        index++;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.array = (T[]) new Object[0];
        index=0;
        size=0;
    }

    public T peek() {
        if (array == null || index <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return array[0];
        }
    }

    public T poll() {
        if (index <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T returnendStatment = array[0];
        for (int i = 1; i < index; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        index--;
        return returnendStatment;
    }
}
