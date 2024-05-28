package com.cydeo.task_apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTesting {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(250,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        AppleGreenColorPredicate abc = new AppleGreenColorPredicate();
        List<Apple> greenColor = filterApples(inventory,abc);
        System.out.println(greenColor); // OR
        System.out.println("**************************");
        List<Apple> greenColors = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenColors);
        System.out.println("************************");
        //List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(filterApples(inventory,new AppleHeavyPredicate()));
        System.out.println("************************");
        ApplePredicate weightApple = apple -> apple.getWeight() >200;
        System.out.println(filterApples(inventory,weightApple));




    }

    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple :inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }



}
