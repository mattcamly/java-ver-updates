package com.cydeo.task_apple;

public class AppleHeavyPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >200;
    }
}
