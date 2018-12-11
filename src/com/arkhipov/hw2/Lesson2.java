package com.arkhipov.hw2;

//import com.arkhipov.MyArrayList;
//import com.arkhipov.MySortedArrayList;

import java.awt.event.ItemEvent;
import java.util.Random;

public class Lesson2 {

    final static int n = 10000;
    final static int maximum = 10000;
    final static int minimum = 0;

    public static void main(String[] args) {
        Random random = new Random();


//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 2*i;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i]+1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
        MyArrayList<Integer> list1 = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();
//        MySortedArrayList <Character> list = new MySortedArrayList<>();
//        list.insert('a');
//        list.insert('c');
//        list.insert('r');
//        list.insert('w');
//        System.out.println(list.find('s'));
//        System.out.println(list.find('w'));
//        System.out.println(list.size());
//        list.insert('s');
//        list.insert('o');
//        list.insert('e');
//        System.out.println(list);
//        System.out.println(list.get(4));
//        list.set(4, 'h');
//        System.out.println(list.get(4));
//        System.out.println(list.delete('m'));
//        System.out.println(list.delete('b'));
//        System.out.println(list);
//        list.insertionSort();
//        System.out.println(list);

        for (int i = 0; i < n-1; i++) {
            int temp = random.nextInt(maximum)+minimum;
            list1.insert(temp);
            list2.insert(temp);
        }


        System.out.println(list1);
        System.out.println(list2);

        long start1 = System.currentTimeMillis();
        list1.selectionSort();
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("sort time1: " + timeConsumedMillis1);
        System.out.println(list1);
        System.out.println(list2);

        long start2 = System.currentTimeMillis();
        list2.insertionSort();
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println("sort time2: " + timeConsumedMillis2);
        System.out.println(list2);
    }
}
