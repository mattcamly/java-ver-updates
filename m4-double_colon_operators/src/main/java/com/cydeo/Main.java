package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Predicate<Integer> pred = (p) -> p%2 ==0 ? true : false;

        Calculate sum = (x, y) -> System.out.println(x + y);

        Calculate s1 = (x, y) -> Calculator.findSum(x,y);

        // REFERENCE TO A STATIC METHOD
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,20);  // here we are calling the implementation IT IS STATIC METHOD WE CALL IT BY NAME

        // REFERENCE TO A INSTANCE METHOD , TO CALL IT WE NEED OBJECT
        Calculator obj = new Calculator();
        Calculate s3 = obj ::findMultiply; //or

        Calculate s4 = new Calculator()::findMultiply;
        s4.calculate(3,4);

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i) ;

        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer,Double> b = new MyClass()::method;
        System.out.println(b.apply(2));
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;





    }
}
