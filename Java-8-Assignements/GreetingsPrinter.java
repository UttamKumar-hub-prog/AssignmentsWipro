package com.java8Assignments;

@FunctionalInterface
interface Printer {
    void print(String message);
}

public class GreetingsPrinter {
    public static void main(String[] args) {
        Printer printer = msg -> System.out.println("Message: " + msg);
        greet("Hello, Uttam!", printer);
    }

    public static void greet(String msg, Printer printer) {
        printer.print(msg);
    }
}

// Message: Hello, Uttam!