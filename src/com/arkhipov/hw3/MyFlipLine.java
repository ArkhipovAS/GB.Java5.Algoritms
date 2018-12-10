package com.arkhipov.hw3;

public class MyFlipLine <Item>{
    private String expr;

    private Object [] queue = new Object[2];
    private int size = 0;
    private int start = 0;
    private int end = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void resize (int capacity){
        Object [] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[(start + i) % size];

        }
        queue = temp;
        start = 0;
        end = size;
    }

    public void enqueue (Item item){
        if(size ==queue.length){
            resize(2 * queue.length);
        }
        queue[end++] = item;
        end %= queue.length;
        size++;
    }

    public void flipSt (){
        Object [] temp = new Object[size];
        for (int i = 0, j = size-1; i < size; i++, j--) {
            temp[i] = queue[j];
        }
        queue = temp;
    }

    @Override
    public String toString (){
        String s = "";
//        for (int i = size-1; i >= 0; i--) {
        for (int i = 0; i < size; i++) {
            s = s + queue[(start +i)%queue.length] + ", ";
        }
        return s;
    }


}
