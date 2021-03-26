package A06SetAndMapAdvanceLab;

import java.util.*;
import java.util.stream.Collectors;

public class E03VoinaNumberGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int round = 50;

        while (round -- > 0 ) {
            Iterator<Integer> firstIter = firstPlayer.iterator();
            int firstCard = firstIter.next();
            firstIter.remove();
            Iterator<Integer> secondIter = secondPlayer.iterator();
            int secondCard = secondIter.next();
            secondIter.remove();

            if (firstCard > secondCard) {
                firstPlayer.addAll(Arrays.asList(firstCard, secondCard));
            } else if (firstCard < secondCard){
                secondPlayer.addAll(Arrays.asList(firstCard, secondCard));
            }

            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }
        }
        String output = "Draw!";
        if (firstPlayer.size() < secondPlayer.size()) {
            output = "Second player win!";
        } else if (firstPlayer.size() > secondPlayer.size()) {
            output = "First player win!";
        }
        System.out.println(output);
    }
}
