package A02A03StacksAndQueuesLab;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Scanner;

public class E05PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Instant start = Instant.now();
        ArrayDeque<String> printer = new ArrayDeque<>();
        String command = scan.nextLine();

        while (!"print".equalsIgnoreCase(command)) {

            if ("cancel".equalsIgnoreCase(command)) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                   String last = printer.pollFirst();
                    System.out.printf("Canceled %s%n", last);
                }
            } else {
                printer.offer(command);
            }
            command = scan.nextLine();
        }
        for (String print : printer) {
            System.out.println(print);
        }
        Instant stop = Instant.now();

        System.out.println(Duration.between(start, stop));
    }
}
