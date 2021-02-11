package A02A03StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E06HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(" ");
        int count = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String name : names) {
            queue.offer(name);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < count; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.pop());
        }
        System.out.println("Last is "+queue.peek());
    }
}
