package org.example;

import java.util.Arrays;

public class MyQueue<T> {

    private T[] array;
    private int size;
    private int index = 0;

    //initialization array
    public MyQueue(int size) {
        @SuppressWarnings("unchecked") final T[] tempArray = (T[]) new Object[size];
        this.array = tempArray;
        this.size = size;
    }

    private void grow() {
        size *= 2;
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
            array[index] = value;
            index++;
        } else {
            array[index] = value;
            index++;
        }
    }

    public void size() {
        System.out.println(size);
    }

    public void clear() {
        @SuppressWarnings("unchecked") final T[] tempArray = (T[]) new Object[size];
        this.array = tempArray;
    }

    public void peek() {
        if (array != null && size > 0) {
            System.out.println(array[0]);
        } else {
            System.out.println("Array is null");
        }
    }

    public T poll() throws ArrayIndexOutOfBoundsException {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T returnendStatment = array[0];
        for (int i = 0 + 1; i < index; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        index--;
        return returnendStatment;
    }
}
