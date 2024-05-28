package com.cydeo.task;

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish`s name that has less than 400 calories

        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                .map(str->str.getName())
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                //.map(str->str.getName().length())
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name >300
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                //.map(str->str.getName())
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("****** task4 *****");
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                //you can con do from opposite site like this too
                // .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);



    }
}
