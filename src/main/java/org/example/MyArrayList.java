package org.example;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] array;
    private int size;
    private int index = 0;

    //initialization array
    public MyArrayList(int size) {
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

    public T get(int index) {
        if (this.index < index || index < -1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public void add(T value) {
        if (size <= index) {
            grow();
        }
        array[index] = value;
        index++;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }

    public T remove(int index) {
        if (this.index < index || index < -1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T deletedElement = array[index];
        for (int i = index + 1; i < this.index; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        this.index--;
        return deletedElement;
    }

    public void clear() {
        this.array = (T[]) new Object[0];
        index = 0;
        size = 0;
    }

    public int size() {
        return this.index;
    }
}
