package org.example;

import java.util.Arrays;

public class MyStack<T> {

    private T[] array;
    private int size;
    private int index = 0;

    //initialization array
    public MyStack(int size) {
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

    public void push(T value) {
        if (size <= index) {
            grow();
            for (int i = index; 0 < i; i--) {
                T temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            array[0] = value;
            index++;
        } else if (index == 0) {
            array[0] = value;
            index++;
        } else {
            for (int i = index; 0 < i; i--) {
                T temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            array[0] = value;
            index++;
        }
    }

    public void size() {
        System.out.println(size);
    }

    public void clear() {
        @SuppressWarnings("unchecked") final T[] tempArray = (T[]) new Object[0];
        this.array = tempArray;
        index = 0;
        size = 0;
    }

    public T peek() throws ArrayIndexOutOfBoundsException {
        if (array[0] == null || index <= 0 || array == null) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return array[0];
        }
    }

    public T pop() throws ArrayIndexOutOfBoundsException {
        if (index <= 0) {
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

    public T remove(int index) throws ArrayIndexOutOfBoundsException {
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
}
