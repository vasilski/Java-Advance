package A03StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class E03MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int commands = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < commands ; i++) {
           int command = scan.nextInt();
            if (1 == command) {
                int elements = scan.nextInt();
                numbers.push(elements);
            } else if (2 == command) {
                numbers.pop();
            }else if (3 == command) {
                numbers.peek();
                System.out.println(Collections.max(numbers));
            }
        }
    }
}
