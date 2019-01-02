package com.github.kiolk.jacocoproject;

public class Manager {

    public int sum(int a, int b) {
        if (a > b) {
            return a + b;
        } else {
            return b + a;
        }
    }

    public int minus(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    public float division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Second argument not possible zero");
        } else {
            return a / b;
        }
    }

    public int multiplication(int a, int b){
        if(a > b){
            return a * b;
        }else{
            return b * a;
        }
    }
}