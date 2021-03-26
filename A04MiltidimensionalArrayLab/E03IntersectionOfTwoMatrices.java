package A04MiltidimensionalArrayLab;

import java.util.Scanner;

public class E03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int rows = Integer.parseInt(skippingBlankLines(scan));
        int cols = Integer.parseInt(skippingBlankLines(scan));
        
        char[][] firstMatrix = readCharMatrix(scan, rows);
        char[][] secondMatrix = readCharMatrix(scan, rows);

        char[][] answer = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    answer[row][col] = firstMatrix[row][col];
                } else {
                    answer[row][col] = '*';
                }
            }
        }
        printMatrix(answer);
    }
    private static String skippingBlankLines (Scanner scan) {
        String line = scan.nextLine().trim();
        while (line.length() == 0) {
            line = scan.nextLine().trim();
        }
        return  line;
    }

    private static char[][] readCharMatrix(Scanner scan, int rows) {

        char[][] matrix = new char[rows][];

        for (int row = 0; row < rows; row++) {
            String line = skippingBlankLines(scan);
            String strippedString = line.replaceAll("\\s+", "");
            matrix[row] = strippedString.toCharArray();
        }
        return matrix;
    }
       private static void printMatrix(char [][] matrix) {
           for (int row = 0; row < matrix.length; row++) {
               for (int col = 0; col < matrix[row].length; col++) {
                   System.out.print(matrix[row][col] + " ");
               }
               System.out.println();
           }
       }
}