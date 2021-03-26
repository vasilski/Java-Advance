package A04MiltidimensionalArrayLab;

import java.util.Scanner;

public class E04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(", ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scan.nextLine().replaceAll(",", "").split("\\s+");
            for (int col = 0; col < cols; col++) {
                    matrix[row][col] = Integer.parseInt(input[col]);
                }
            }

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
