package com.java8Assignments;

import java.util.*;
import java.util.stream.Collectors;

public class PrettyJoiner {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Hyderabad");
        String result = cities.stream()
                              .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}

// Delhi, Mumbai, Hyderabad