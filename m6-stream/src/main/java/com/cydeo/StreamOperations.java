package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,2,3,4);
        list.forEach(System.out::println);
        System.out.println("************** FILTER  *************");

        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("********* FILTERing unique elements with distinct  *************");

        Stream<Integer> str =  list.stream()
                .filter(i->i%2==0)
                .distinct();
        str.forEach(System.out::println); // stream closed foreach method as terminal operation

        System.out.println("********* FILTERing with LIMIT *************");
        list.stream()
                .filter(i-> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("********* FILTERing with SKIP *************");
        list.stream()
                .filter(i->i%2==0)
                .skip(2)
                .forEach(System.out::println);
        System.out.println("********** MAPPING ***********");
        list.stream()
                .map(number ->number *2)
                .filter(i -> i%3==0)
                .forEach(System.out::println);








    }
}
