package com.java8Assignments;

import java.util.*;

public class MethodReferenceSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vijay", "Anil", "Ravi", "Neha");
        names.sort(String::compareTo);
        names.forEach(System.out::println);
    }
}
