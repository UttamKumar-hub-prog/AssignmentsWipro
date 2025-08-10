package Assignments;

import java.util.Stack;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 commands:");
        stack.push(sc.nextLine());
        stack.push(sc.nextLine());
        stack.push(sc.nextLine());

        String undone = stack.pop();
        System.out.println("Undo: " + undone);

        stack.push(undone);
        System.out.println("Redo: " + undone);

        System.out.println("Final Stack: " + stack);
        sc.close();
    }
    
}
