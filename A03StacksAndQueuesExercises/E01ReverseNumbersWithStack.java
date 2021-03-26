package A03StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E01ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(input).forEach(stack::push);

        for (String s : stack) {
            System.out.print(s + " ");
        }
    }
}
