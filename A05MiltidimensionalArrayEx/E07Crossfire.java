package A05MiltidimensionalArrayEx;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E07Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        ArrayList<ArrayList<Integer>> filed = new ArrayList<>();

        int counter = 1;

        for (int row = 0; row < rows; row++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                numbers.add(counter++);
            }
            filed.add(numbers);
        }
        String input = scan.nextLine();

        while (!input.equals("Nuke it from orbit")) {

            int[] tokens = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = tokens[0];
            int col = tokens[1];
            int radius = tokens[2];

            for (int i = col - radius; i <= col + radius; i++) {
                if (row >= 0 && row < filed.size() && i >= 0 && i < filed.get(row).size()) {
                    filed.get(row).set(i, -1);
                }
            }

            //currentRow.removeAll(Arrays.asList(-1));
            for (int i = row - radius; i <= row + radius; i++) {
                if (i >= 0 && i < filed.size() && col >= 0 && col < filed.get(i).size()) {
                    filed.get(i).set(col, -1);
                }
            }
            for (ArrayList<Integer> integers : filed) {
                removeNegativeValues(integers);
            }

            filed.removeIf(ArrayList::isEmpty);

            input = scan.nextLine();
        }

        printMatrix(filed);
    }

    private static void removeNegativeValues(ArrayList<Integer> currentRow) {
        currentRow.removeIf(e -> e == -1);
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
