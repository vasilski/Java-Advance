package A04MiltidimensionalArrayLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E02PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);

        int number = scan.nextInt();

        Deque<String> answers = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(number == matrix[row][col]) {
                    String matchingPair = row + " " + col;
                    answers.offer(matchingPair);
                }
            }
        }
        if (answers.isEmpty()) {
            System.out.println("not found");
        }
        while (!answers.isEmpty()) {
            System.out.println(answers.poll());
        }
    }

    private static int[][] readMatrix(Scanner scan) {
        String input = scan.nextLine();
        String[] inputLine= input.split("\\s+");
        int rows = Integer.parseInt(inputLine[0]);
        int cols = Integer.parseInt(inputLine[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++){
                matrix[row][col] = scan.nextInt();
            }
        }
        return matrix;
    }
}
