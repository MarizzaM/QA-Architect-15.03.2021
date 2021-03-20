package com.app;

import java.util.ArrayList;

public class MyQueue {

    ArrayList<Integer> numbers_queue = new ArrayList<>();

    public void enqueue (Integer x){
        numbers_queue.add(x);
    }

    public Integer dequeue (){
        Integer first_number = numbers_queue.get(0);
        numbers_queue.remove(0);
        return first_number;
    }

    public void clear(){
        numbers_queue.clear();
    }

    public int count(){
        return (int)numbers_queue.stream().count();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "numbers_queue=" + numbers_queue +
                '}';
    }
}
