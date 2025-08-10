package com.java8Assignments;

import java.util.*;

public class ParallelSquarePrinter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
        numbers.parallelStream()
               .forEach(n -> System.out.println(n + "^2 = " + (n * n)));
    }
}
