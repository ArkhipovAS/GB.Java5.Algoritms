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

//        Expression expr = new Expression("(1+2()<+{5)}>");
//        System.out.println(expr.checkBrackets());

//        MyArrayQueue<Integer> q = new MyArrayQueue<>();
//        q.enqueue(5);
//        q.enqueue(2);
//        q.enqueue(4);
//        q.enqueue(45);
//        q.enqueue(5);
//        System.out.println(q);
//        System.out.println(q.peekFront());
//        q.dequeue();
//        q.dequeue();
//        System.out.println(q.peekFront());
//        System.out.println(q);
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        System.out.println(q.isEmpty());

//        PostfixExpression expr = new PostfixExpression("3 2 + 2 *");
//        System.out.println(expr.calcExpression());

        MyFlipLine<String> st = new MyFlipLine<>();
        st.enqueue("q");
        st.enqueue("w");
        st.enqueue("e");
        st.enqueue("r");
        st.enqueue("t");
        st.enqueue("y");
        System.out.println(st);
        st.flipSt();
        System.out.println(st);



    }

}
