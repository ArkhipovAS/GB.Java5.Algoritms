package com.arkhipov.hw4;

import java.util.Iterator;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("-------------List------------------");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);

        /*Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            Integer current = iter.next();
            System.out.println(current);
        }*/

        for (Integer current:
             list) {
            System.out.print(current + ", ");
        }
        System.out.println();
        System.out.println("-------------Queue-----------------");
        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();
        queue.enquue(1);
        queue.enquue(2);
        queue.enquue(3);
        queue.enquue(4);
        System.out.println(queue + "queue");
        queue.dequeue();
        System.out.println(queue + "delete first item");
        System.out.println(queue.peek()+ " queue peek");
        System.out.println("-------------Stack-----------------");

        MyLinkedStack<Integer> stack = new MyLinkedStack<>();
        System.out.println("Stack is empty? " + stack.isEmpty());
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.peek() + "Item of peek stack");
        stack.pop();
        System.out.println(stack.peek() + "Item of peek stack");
    }
}
