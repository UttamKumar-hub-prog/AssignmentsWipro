package Assignments;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        while (true) {
            System.out.print("Enter print job name (or 'print' to print next job, 'exit' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) break;
            else if (input.equalsIgnoreCase("print")) {
                String job = printQueue.poll();
                if (job != null)
                    System.out.println("Printing: " + job);
                else
                    System.out.println("No jobs to print!");
            } else {
                boolean added = printQueue.offer(input);
                if (!added)
                    System.out.println("Queue full! Job skipped.");
                else
                    System.out.println("Job added: " + input);
            }
            System.out.println("Current queue: " + printQueue);
        }
        sc.close();
    }
}
