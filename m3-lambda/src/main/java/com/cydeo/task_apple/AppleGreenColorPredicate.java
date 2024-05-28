package com.cydeo.task_apple;

import java.util.ArrayList;
import java.util.List;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
