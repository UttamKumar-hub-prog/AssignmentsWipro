package com.java8Assignments;

import java.util.*;
import java.util.function.Predicate;

public class CustomFilterChain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aruna", "Ajay", "Rama", "Amala", "Sita");

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        names.stream()
             .filter(startsWithA.and(endsWithA))
             .forEach(System.out::println);
    }
}
