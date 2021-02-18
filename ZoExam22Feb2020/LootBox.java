package ZoExam22Feb2020;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> firstLootBox = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> second = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondLootBox = new ArrayDeque<>();


        for (Integer lootBox : second) {
            secondLootBox.push(lootBox);
        }

        int sum = 0;

        while (!firstLootBox.isEmpty() && !secondLootBox.isEmpty() ) {
               int firstBox = firstLootBox.peek();
               int secondBox = secondLootBox.peek();

               int claimed = firstBox + secondBox;

               if (claimed % 2 == 0) {
                   firstLootBox.pop();
                   secondLootBox.poll();
                   sum += claimed;
                   continue;
               } else {
                   secondLootBox.poll();
                   firstLootBox.offer(secondBox);
                   continue;
               }

        }
        if (firstLootBox.isEmpty()) {
            System.out.println("First lootbox is empty");
        }
        if (secondLootBox.isEmpty()) {
            System.out.println("Second lootbox is empty");
        }

        if (sum >= 100) {
            System.out.printf("Your loot was epic! Value: %d", sum);
        } else {
            System.out.printf("Your loot was poor... Value: %d", sum);
        }
    }
}
