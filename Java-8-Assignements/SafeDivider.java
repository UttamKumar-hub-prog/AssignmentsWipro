package com.java8Assignments;

import java.util.Optional;

public class SafeDivider {
    public static Optional<Integer> divide(int a, int b) {
        return b == 0 ? Optional.empty() : Optional.of(a / b);
    }

    public static void main(String[] args) {
        Optional<Integer> result = divide(10, 0);
        System.out.println(result.orElseGet(() -> {
            System.out.println("Not Allowed");
            return null;
        }));
    }
}
