package A03StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05Robotics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputRobots = scan.nextLine().split(";");

        Map<String, Integer> robots = splitRobotsDataIntoLinkedHashMap(inputRobots);

        int[] processTimes = new int[robots.size()];

        String[] time = scan.nextLine().split(":");

        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);

        long totalSeconds = hours * 3600 + minutes * 60 + seconds;

        ArrayDeque<String> products = new ArrayDeque<>();

        String line = scan.nextLine();

        while (!line.equals("End")) {
            products.add(line);
            line = scan.nextLine();
        }

        while (!products.isEmpty()) {
            totalSeconds++;
            String current = products.poll();

            decraseProcessTime(processTimes);

            if (!assingJob(robots, processTimes, current, totalSeconds)) {
                products.offer(current);
            }
        }
    }

    private static void decraseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] > 0) {
                --processTimes[i];
            }
        }
    }

    private static boolean assingJob(Map<String, Integer> robots, int[] processTimes, String current, long totalSeconds) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] == 0) {
                int count = 0;
                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count == i) {
                        processTimes[i] = entry.getValue();
                        longJobAssigned(entry.getKey(), current, totalSeconds);
                        return true;
                    }
                    count++;
                }
            }
        }
        return false;
    }

    private static void longJobAssigned(String name, String product, long totalSeconds) {
        long hours = (totalSeconds / 3600) % 24;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        System.out.println(String.format("%s - %s [%02d:%02d:%02d]", name, product, hours, minutes, seconds));
    }

    private static Map<String, Integer> splitRobotsDataIntoLinkedHashMap(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();

        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int index = line.indexOf("-");
            String name = line.substring(0, index);
            int time = Integer.parseInt(line.substring(index + 1));

            robots.put(name, time);
        }
        return robots;
    }
}
