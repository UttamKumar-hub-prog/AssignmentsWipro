package com.java8Assignments;

import java.util.*;

public class ParallelSquarePrinter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
        numbers.parallelStream()
               .forEach(n -> System.out.println(n + "^2 = " + (n * n)));
    }
}

// 2^2 = 4
// 6^2 = 36
// 3^2 = 9
// 4^2 = 16
// 5^2 = 25