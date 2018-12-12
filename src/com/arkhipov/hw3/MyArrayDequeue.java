package com.arkhipov.hw3;

import java.util.NoSuchElementException;

public class MyArrayDequeue<Item> {

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

    public void enqueueRear (Item item){
        if(size == queue.length){
            resize(2 * queue.length);
        }
        queue[end++] = item;
        end %= queue.length;
        size++;
    }

    public void enqueueFront (Item item){
        if(size == queue.length){
            resize(2 * queue.length);
        }
        Object [] temp = new Object[size+1];
        for (int i = start; i < size; i++) {
            temp[i+1] = queue[i];
        }
        queue = temp;

        queue[start] = item;
        end ++;
        end %= queue.length;
        size++;
    }

    public Item dequeueRear(){
        if(isEmpty()){
            throw  new NoSuchElementException();
        }
        Item item = (Item) queue[end];
//        queue[end] = null;
        size--;
        end--;
        start %= queue.length;
        end %= queue.length;
        if (size >0 && size == queue.length/4){
            resize(queue.length / 2);
        }
        return item;
    }

    public Item dequeueFront(){
        if(isEmpty()){
            throw  new NoSuchElementException();
        }

        Object [] temp = new Object[size-1];
        for (int i = start; i < size-1; i++) {
            temp[i] = queue[i+1];
        }
        queue = temp;
//        queue[start] = null;
        size--;
        start %= queue.length;
        end %=queue.length;

        Item item = (Item) queue[start];

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
        for (int i = start; i < size; i++) {
            s = s + queue[(start +i)%queue.length] + ", ";
        }
        return s;
    }

}
