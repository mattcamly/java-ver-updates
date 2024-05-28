package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero argument constructor
       Supplier<Car> c1 = ()-> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car ::new; // for constructor method reference we used new keyword
        System.out.println(c2.get().getModel());

        // One argument constructor
        Function<Integer,Car> f1 = model->new Car(model);
        Function<Integer,Car> f2 = Car::new;

        //Two argument constructor
        BiFunction<String,Integer,Car> a1 = Car :: new;
        Car honda = a1.apply("Honda",2015);
        System.out.println(honda.getMake()+" "+honda.getModel());

        BiFunction<String,Integer,Car> t1 = Car ::new;
        Car toyota = t1.apply("camry",2021);
        System.out.println(toyota.getMake()+" "+toyota.getModel());

        BiFunction<String,Integer,Car> b1 = Car::new;
        Car bmw = b1.apply("bmw",2024);
        System.out.println(bmw.getMake()+" "+ bmw.getModel());




    }
}
