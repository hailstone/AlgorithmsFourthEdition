package $2_Sorting.$2_5_applications;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hailstone01 on 2/1/16.
 */
public class Ex12 {
    static class Job implements Comparable<Job> {
        private String name;
        private double time;

        public Job(String name, double time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public int compareTo(Job o) {
            return Double.compare(this.time, o.time);
        }

        @Override
        public String toString() {
            return "name: " + name + " time: " + time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Job[] jobs = new Job[N];

        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            double time = scanner.nextDouble();
            jobs[i] = new Job(name, time);
        }

        Arrays.sort(jobs);

        for (int i = 0; i < N; i++) {
            System.out.println(jobs[i]);
        }
    }
}
