package Assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        LinkedList<String> searches = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter search (or 'exit'): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            searches.addLast(input);
            if (searches.size() > 3) {
                searches.removeFirst();
            }

            System.out.println("Last 3 searches: " + searches);
        }
        sc.close();
    }
}

