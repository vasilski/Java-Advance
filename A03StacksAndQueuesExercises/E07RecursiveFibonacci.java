package A03StacksAndQueuesExercises;

import java.util.Scanner;

public class E07RecursiveFibonacci {

    private static long[] memory;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        memory = new long[n + 1];

        long result = fibonacci(n);

        System.out.println(result);
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }

        return memory[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }
}
