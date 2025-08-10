package Assignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < 10) {
                nums[i] *= 2;
            }
            sum += nums[i];
        }

        double average = sum / 5.0;
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average);
        sc.close();    }
}
