package com.app;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> numbers_stack = new ArrayList<>();

    public void push (Integer x){
        numbers_stack.add(x);
    }

    public Integer pop (){
        Integer last_number = numbers_stack.get(numbers_stack.size()-1);
        numbers_stack.remove(numbers_stack.size()-1);
        return last_number;
    }

    public int peek (){
        return numbers_stack.get(numbers_stack.size()-1);
    }

    public void clear (){
        numbers_stack.clear();
    }

    public int  count (){
       return (int)numbers_stack.stream().count();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "numbers_stack=" + numbers_stack +
                '}';
    }
}
