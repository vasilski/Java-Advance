package A05MiltidimensionalArrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class E04MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = readArray(scan);

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scan);
        }

        int maxSum = Integer.MIN_VALUE;
        int indexRow = 0;
        int indexCol = 0;

        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int sum = calculateMatrixSum(matrix, row, col);
                if (sum > maxSum) {
                    maxSum = sum;

                    indexRow = row;
                    indexCol = col;
                }
            }
        }
                System.out.println("Sum = " +  maxSum);

        printMaxSubMetrix (matrix, indexRow, indexCol);
    }

    private static void printMaxSubMetrix(int[][] matrix, int indexRow, int indexCol) {
        for (int row = indexRow - 1; row <= indexRow + 1; row++) {
            for (int col = indexCol - 1; col <= indexCol +1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;

        //C
        sum += matrix[row][col];
        //R
        sum += matrix[row][col + 1];
        //L
        sum += matrix[row][col - 1];
        //U
        sum += matrix[row - 1][col];
        //D
        sum += matrix[row + 1][col];
        //RU
        sum += matrix[row - 1][col + 1];
        //LU
        sum += matrix[row - 1][col - 1];
        //RD
        sum += matrix[row + 1][col + 1];
        //LD
        sum += matrix[row + 1][col - 1];

        return sum;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
