package com.java8Assignments;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyMapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Anu", "Ravi", "Anu", "Kiran", "Anu");
        Map<String, Long> freqMap = names.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqMap);
    }
}
