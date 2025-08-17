package com.java8Assignments;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kiran", "Chandrika", "Meena", "Suresh");
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();
        System.out.println("Count: " + count);
    }
}

// Count: 2