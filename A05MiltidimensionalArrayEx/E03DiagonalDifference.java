package A05MiltidimensionalArrayEx;

import java.util.Scanner;

public class E03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        int [][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String[] input = scan.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int primarySum = calcFirstSum(matrix);
        int secondSum = calcSecondSum(matrix);
        int result = primarySum - secondSum;
        System.out.println(Math.abs(result));
    }

    private static int calcFirstSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length ; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
    private static int calcSecondSum(int[][] matrix) {
        int sum = 0;

        int row = 0;
        int col = matrix.length - 1;
        while (col >= 0) {
            sum += matrix[row][col];
            row++;
            col--;
        }

        return sum;
    }
}
