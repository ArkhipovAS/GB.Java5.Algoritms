package com.arkhipov.hw6;

import java.nio.charset.Charset;
import java.util.Random;

public class Lesson6 {
    public static void main(String[] args) {
        final int maximum = 100;
        final int minimum = 0;

        Random random = new Random();
//        BST<Character, Integer> assArr = new BST<>();
//        BST<String, Integer> assArr = new BST<>();
        BST<Integer, Integer> assArr = new BST<>();
        byte[] array = new byte[1];
        int i=0;
        int templevel = 0;
//        for (int j = 0; j < 20; j++) {
            while (templevel < 6){
                int temp = random.nextInt(maximum)*(random .nextBoolean() ? -1 : 1);
                new Random().nextBytes(array);
                String generatedString = new String(array, Charset.forName("CP1251"));
                //assArr.put(generatedString, temp);
                assArr.put(temp, temp);
//                System.out.println("Key: " + generatedString + " + Value: " +assArr.get(generatedString) +" Level: " + assArr.level());
                System.out.println("Key: " + temp + " Value: " +assArr.get(temp));
//                System.out.println(assArr.levell() + " " +assArr.levelr() + " AVLtree: " + assArr.avltree());
                templevel = assArr.level();
            }
//        }


//        assArr.put('S', 123);
//        System.out.println("Key: " + 'S' + " + Value: " +assArr.get('S') +" Level: " + assArr.level());
//        assArr.put('E', 345);
//        System.out.println("Key: " + 'E' + " + Value: " +assArr.get('E') +" Level: " + assArr.level());
//        assArr.put('A', 123);
//        System.out.println("Key: " + 'A' + " + Value: " +assArr.get('A') +" Level: " + assArr.level());
//        assArr.put('C', 987);
//        System.out.println("Key: " + 'C' + " + Value: " +assArr.get('C') +" Level: " + assArr.level());
//        assArr.put('R', 911);
//        System.out.println("Key: " + 'R' + " + Value: " +assArr.get('R') +" Level: " + assArr.level());
//        assArr.put('H', 112);
//        System.out.println("Key: " + 'H' + " + Value: " +assArr.get('H') +" Level: " + assArr.level());
//        assArr.put('M', 012);
//        System.out.println("Key: " + 'M' + " + Value: " +assArr.get('M') +" Level: " + assArr.level());
//        assArr.put('X', 003);
//        System.out.println("Key: " + 'X' + " + Value: " +assArr.get('X') +" Level: " + assArr.level());
//        System.out.println();
    }
}
