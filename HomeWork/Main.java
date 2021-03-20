package com.app;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
// a (1)
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.enqueue(25);

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue.count());

        myQueue.clear();

        System.out.println(myQueue);

        System.out.println("======================");

//a (2)
        MyStack myStack = new MyStack();

        myStack.push(101);
        myStack.push(102);
        myStack.push(103);
        myStack.push(104);
        myStack.push(105);

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);

        System.out.println(myStack.peek());

        myStack.clear();

        System.out.println(myStack.count());

        System.out.println("======================");
// b
        MyMap myMap = new MyMap();

        myMap.put(1, new Person("Marisha", LocalDateTime.of(1989,4,20,0,0,0), 31));
        myMap.put(2, new Person("Alex", LocalDateTime.of(1991,10,8,0,0,0), 31));
        System.out.println(myMap);

        System.out.println(myMap.get(1));
        System.out.println(myMap.containsKey(10));
        System.out.println(myMap.getKeys());
        System.out.println(myMap.getValues());
        System.out.println(myMap.count());
        myMap.clear();
        System.out.println(myMap);
    }
}