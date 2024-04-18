package org.example;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] array;
    private int size;
    private int index=0;
//initialization array
    public MyArrayList(int size) {
        @SuppressWarnings("unchecked")
        final T[] tempArray = (T[]) new Object[size];
        this.array = tempArray;
        this.size=size;
    }
    private T[] grow(){
        if(size<=index){
            size*=2;
            return array=Arrays.copyOf(this.array,size);
        }
        else{
            return array;
        }
    }
    public void get(int index){
        System.out.println(array[index]);
    }
     public void add(T value) {
        array[index]=value;
        index++;
    }

    public void remove(int index){
        for (int i = index+1; i < array.length-1; i++) {
            array[i-1] = array[i];
            array[i] = null;
            this.index--;
        }
    }

    public void clear(){
        @SuppressWarnings("unchecked")
        final T[] tempArray = (T[]) new Object[size];
        this.array = tempArray;
    }
}
