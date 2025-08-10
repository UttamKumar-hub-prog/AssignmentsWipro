package Assignments;

import java.util.*;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Task> stage1 = new LinkedList<>();
        Queue<Task> stage2 = new LinkedList<>();

        while (true) {
            System.out.print("Enter task ID (or -1 to process & quit): ");
            int id = sc.nextInt();
            sc.nextLine();  
            if (id == -1) break;
            System.out.print("Enter task name: ");
            String name = sc.nextLine();
            stage1.add(new Task(id, name));
        }

     
        for (Task t : stage1) {
            if (t.id % 2 == 0) {
                stage2.add(t);
            }
        }

        System.out.println("Stage 1 Tasks:");
        for (Task t : stage1) {
            System.out.println(t);
        }
        System.out.println("Stage 2 (Even IDs) Tasks:");
        for (Task t : stage2) {
            System.out.println(t);
        }

        sc.close();
    }
}

class Task {
    int id;
    String name;
    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
