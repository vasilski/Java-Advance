package A04MiltidimensionalArrayLab;

import java.util.Scanner;

public class E01CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scan);
        int[][] secondMatrix = readMatrix(scan);

        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }
        for(int row = 0; row < firstMatrix.length; row++) {
            for( int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
        return;

    }

    private static int[][] readMatrix(Scanner scan) {
        String line = scan.nextLine();
        String[] splitLine= line.split("\\s+");
        int rows = Integer.parseInt(splitLine[0]);
        int cols = Integer.parseInt(splitLine[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            line = scan.nextLine();
            splitLine= line.split("\\s+");
            for(int col = 0; col < cols; col++){
                matrix[row][col] = Integer.parseInt(splitLine[col]);
            }
        }
        return matrix;
    }
}
