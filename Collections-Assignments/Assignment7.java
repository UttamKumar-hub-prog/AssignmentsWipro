package Assignments;
import java.util.*;

class Job implements Comparable<Job> {
    String name;
    int urgency;

    public Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public int compareTo(Job other) {
        if (this.urgency != other.urgency)
            return Integer.compare(this.urgency, other.urgency);
        return Integer.compare(this.name.length(), other.name.length());
    }

    @Override
    public String toString() {
        return name + " (" + urgency + ")";
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 jobs with urgency (name urgency):");
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\\s+");
            String jobName = parts[0];
            int urgency = Integer.parseInt(parts[1]);
            pq.add(new Job(jobName, urgency));
        }

        System.out.println("Processing jobs (most urgent first):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        sc.close();
    }
}
