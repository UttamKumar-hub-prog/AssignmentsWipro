package Assignments;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedBlockingQueue<String> chatQueue = new LinkedBlockingQueue<>(5);

        while (true) {
            System.out.print("Enter chat message (or 'read' to consume, 'exit' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) break;
            else if (input.equalsIgnoreCase("read")) {
                String msg = chatQueue.poll();
                if (msg != null)
                    System.out.println("Read message: " + msg);
                else
                    System.out.println("No messages to read!");
            } else {
                if (chatQueue.size() == 5) {
                    System.out.println("Queue has 5 messages. Pause adding until some are read.");
                } else {
                    chatQueue.offer(input);
                    System.out.println("Message added: " + input);
                }
            }
            System.out.println("Current chat queue: " + chatQueue);
        }
        sc.close();
    }
}
