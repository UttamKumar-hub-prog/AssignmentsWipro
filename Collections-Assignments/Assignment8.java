package Assignments;

import java.util.*;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> messages = new ArrayDeque<>();
        final int MAX = 4;

        while (true) {
            System.out.print("Enter a message (or 'exit' to stop): ");
            String msg = sc.nextLine();
            if (msg.equalsIgnoreCase("exit")) break;
            if (messages.size() == MAX) {
                messages.removeFirst();
            }
            messages.addLast(msg);

            System.out.println("Current chat history:");
            for (String m : messages) {
                System.out.println(m);
            }
        }
        sc.close();
    }
}
