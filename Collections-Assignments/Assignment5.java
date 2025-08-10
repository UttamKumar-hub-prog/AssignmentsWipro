package Assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        LinkedList<String> apps = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 app names:");
        for (int i = 0; i < 5; i++) {
            String app = sc.nextLine();

            if (apps.contains(app)) {
                apps.remove(app);  
            }

            apps.addFirst(app);  
        }

        System.out.println("Recent Apps:");
        for (String app : apps) {
            System.out.println(app);
        }
        sc.close();
    }
}
