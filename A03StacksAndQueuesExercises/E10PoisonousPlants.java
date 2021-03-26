package A03StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E10PoisonousPlants {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] plants = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int [] days = new int[n];

        ArrayDeque<Integer> prevPlants = new ArrayDeque<>();

        prevPlants.push(0);

        for (int i = 0; i < plants.length; i++) {
            int day = 0;

            while (!prevPlants.isEmpty() && plants[prevPlants.peek()] >= plants[i]) {
                day = Math.max(day, days[prevPlants.pop()]);
            }

            if (!prevPlants.isEmpty()) {
                days[i] = day +1;
            }
            prevPlants.push(i);
        }
        System.out.println(Arrays.stream(days).max().getAsInt());
    }
}
