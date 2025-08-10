package Assignments;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        ArrayDeque<String> line = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 customer names:");
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();

            if (name.length() % 2 == 0) {
                line.addFirst(name); 
            } else {
                line.addLast(name);   
            }
        }

        System.out.println("Final queue:");
        for (String name : line) {
            System.out.println(name);
        }
        sc.close();
    }
}
