package com.arkhipov.hw3;

public class Lesson3 {


    public static void main(String[] args) {
//        MyArrayStack<Integer> st = new MyArrayStack<>();
//        st.push(5);
//        st.push(3);
//        st.push(6);
//        st.push(17);
//        System.out.println(st);
//        System.out.println(st.peek());
//        st.pop();
//        st.pop();
//        System.out.println(st.peek());
//        st.push(8);
//        System.out.println(st.peek());
//        System.out.println(st);
        Expression expr = new Expression("(1+2()<+{5)}>");
        System.out.println(expr.checkBrackets());
    }

}
