package A04MiltidimensionalArrayLab;

import java.util.Scanner;

public class ZzzDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        int [][] matrix = new int[rows][cols];


      for (int row = 0; row < rows; row++) {
          String[] inputTokens = scan.nextLine().split(" ");
          for (int col = 0; col < cols; col++) {
              matrix[row][col] = Integer.parseInt(inputTokens[col]);

          }
      }
        System.out.println(matrix[0][1]);
    }


 //   private static int[][] readMatrix(Scanner scan) {
 //       String input = scan.nextLine();
 //       String[] inputLine= input.split("\\s+");
 //       int rows = Integer.parseInt(inputLine[0]);
 //       int cols = Integer.parseInt(inputLine[1]);
//
 //       int[][] matrix = new int[rows][cols];
 //       for (int row = 0; row < rows; row++) {
 //           for(int col = 0; col < cols; col++){
 //               matrix[row][col] = scan.nextInt();
 //           }
 //       }
 //       return matrix;
 //   }
//
//
 //   private static void printIntMatrix(int [][] matrix) {
    // //       for (int row = 0; row < matrix.length; row++) {
    // //           for (int col = 0; col < matrix[row].length; col++) {
    // //               System.out.print(matrix[row][col] + " ");
    // //           }
    // //           System.out.println();
    // //       }
    // //   }
}
