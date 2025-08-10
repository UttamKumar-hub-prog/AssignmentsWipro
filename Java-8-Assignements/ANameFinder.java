package com.java8Assignments;

import java.util.*;

public class ANameFinder {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Arjun", "Ravi", "Asha", "Neha", "Ajay");
		names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
	}
}
