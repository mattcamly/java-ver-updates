package com.cydeo;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE;  // each constant is object(new) of Operation each new keyword executing the constructor

    Operation() {
        System.out.println("Constructor");
    }
}
