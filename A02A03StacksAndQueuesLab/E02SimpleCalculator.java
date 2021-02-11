package A02A03StacksAndQueuesLab;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Instant start = Instant.now();

        ArrayDeque<String> stack = new ArrayDeque<>();
        String exp = scan.nextLine();

        Arrays.stream(exp.split(" ")).forEach(stack::offer);

        while (stack.size() > 1) {
            int firstNum = Integer.parseInt(stack.poll());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            if ("+".equalsIgnoreCase(op)) {
                stack.push(firstNum + secondNum + "");
            }else{
                stack.push(firstNum - secondNum + "");
            }
        }
        System.out.println(stack.peek());

        Instant stop = Instant.now();

        System.out.println(Duration.between(start, stop));
    }
}
