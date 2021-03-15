package com.app;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(4);
        integerStack.push(-12);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(0);
        integerStack.push(-2);
        integerStack.push(200);
        integerStack.stream().forEach(System.out::println);
        System.out.println("======================");
        
        Stack<Integer> integerStack1 = new Stack<>();
        for (Integer x : integerStack)
        {
            if(x>0){
                integerStack1.push(x);
            }
        }
        integerStack1.stream().forEach(System.out::println);
        System.out.println("======================");
        integerStack.removeAllElements();

        Stack<Integer> integerStack2 = new Stack<>();

        while (!integerStack1.empty()){
            Integer y = integerStack1.pop();
            integerStack2.push(y);
        }

        integerStack.stream().forEach(System.out::println);
    }
}
