package com.java8Assignments;

interface Power {
    void action();

    default void show() {
        System.out.println("Default method called");
    }
}

public class DefaultPower implements Power {
    public void action() {
        System.out.println("Abstract method implemented");
    }

    public static void main(String[] args) {
        DefaultPower obj = new DefaultPower();
        obj.action();
        obj.show();
    }
}
