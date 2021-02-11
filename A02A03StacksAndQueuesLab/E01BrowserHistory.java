package A02A03StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E01BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String input;

        while (!"Home".equalsIgnoreCase(input = scan.nextLine())) {
            if (!"Back".equalsIgnoreCase(input)) {
                stack.push(input);
                System.out.println(input);
                } else {
                    if (stack.size() > 1) {
                        stack.pop();
                        System.out.println(stack.peek());
                    } else {
                        System.out.println("no previous URLs");
                    }
            }
        }
    }
}
