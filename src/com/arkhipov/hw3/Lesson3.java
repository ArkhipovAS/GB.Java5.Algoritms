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


      MyArrayDequeue<Integer> deq = new MyArrayDequeue<>();
        deq.enqueueRear(5);
        deq.enqueueRear(2);
        deq.enqueueRear(4);
        deq.enqueueRear(45);
        deq.enqueueRear(5);
        System.out.println(deq + "add queue");
        deq.enqueueFront(1);
        deq.enqueueFront(12);
        System.out.println(deq + " add front 2item");
        deq.dequeueRear();
        System.out.println(deq + " remove rear 1 item");
        deq.dequeueFront();
        System.out.println(deq + " remove front 1 item");
        deq.dequeueFront();
        System.out.println(deq + " remove front 1 item");
        deq.enqueueRear(101);
        System.out.println(deq + " add rear 1 item");
        deq.enqueueFront(121);
        System.out.println(deq + " add front 1 item");



    }

}
