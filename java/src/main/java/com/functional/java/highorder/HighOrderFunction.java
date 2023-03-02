package com.functional.java.highorder;

import java.util.function.Function;

public class HighOrderFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> incrementByTwo = i-> i+2;
        Function<Function<Integer, Integer>, Integer> addThree = i-> incrementByTwo.apply(3);

        System.out.println(addThree.apply(incrementByTwo));
    }
}
