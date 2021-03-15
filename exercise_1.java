package com.app;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("56-777-65", "Nissan", "Juke", LocalDateTime.of(2016,3,20,0,0,0), "Black", 5 ));
        cars.add(new Car("32-333-23", "Nissan", "Sentra", LocalDateTime.of(2019,4,20,0,0,0), "Black", 5 ));
        cars.add(new Car("55-333-56", "Lincoln", "Navigator ", LocalDateTime.of(2020,4,3,0,0,0), "White", 7 ));
        cars.add(new Car("55-333-55", "Bugatti", "Chiron", LocalDateTime.of(2021,11,15,0,0,0), "Red", 2 ));
        cars.add(new Car("77-888-77", "Hennessey", "VenomGT", LocalDateTime.of(2018,10,5,0,0,0), "Blue", 2 ));

        print(cars);

        System.out.println("Please enter number from 1 to 5");
        int n = sc.nextInt();

        cars.remove(n-1);
        print(cars);
//        for (Car car : cars)
//        {
//            cars.remove(car);
//        }
        //print(cars);

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(0);
        set1.add(1);
        set1.add(1);
        set1.add(2);

        System.out.println("Set:");
        for (Integer x : set1)
        {
            System.out.println(x);
        }

        Set<String> set2 = new HashSet<>();
        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("a");

        set2.stream().forEach(System.out::println);
    }

    static void print(ArrayList<Car> cars){
        System.out.println("List:");
        for (Car car : cars)
        {
            System.out.println(car);
        }
    }
}
