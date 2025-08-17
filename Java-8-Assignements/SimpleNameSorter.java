package com.java8Assignments;

import java.util.Arrays;
import java.util.List;

public class SimpleNameSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Anu", "Vijay", "Kiran", "Zoya");
        names.sort((a, b) -> a.compareTo(b));
        names.forEach(System.out::println);
    }
}

// Anu
// Kiran
// Ravi
// Vijay
// // Zoya