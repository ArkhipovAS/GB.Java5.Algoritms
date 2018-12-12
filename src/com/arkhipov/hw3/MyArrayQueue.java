package com.arkhipov.hw3;

import java.util.NoSuchElementException;

public class MyArrayQueue <Item>{
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

    public Item dequeue(){
        if(isEmpty()){
            throw  new NoSuchElementException();
        }
        Item item = (Item) queue[start];
        queue[start] = null;
        size--;
        start++;
        start %= queue.length;
        if (size >0 && size == queue.length/4){
            resize(queue.length / 2);
        }
        return item;
    }

    public Item peekFront(){
        if(isEmpty()){
            throw  new NoSuchElementException();
        }
        return (Item) queue[start];
    }

    @Override
    public String toString (){
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + queue[(start +i)%queue.length] + ", ";
        }
        return s;
    }
}
