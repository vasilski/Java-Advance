package A05MiltidimensionalArrayEx;

import java.util.Scanner;

public class E05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        String[][] text = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            text[i] = scan.nextLine().split(" ");
        }
        
        String input = scan.nextLine();

        while (!input.equals("END")) {
            try {

            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Invalid Input");
            }
            printMatrix(text);
            
            input = scan.nextLine();
        }
    }

    private static void printMatrix(String[][] text) {
        for (int row = 0; row < text.length; row++) {
            for (int col = 0; col < text[row].length; col++) {
                System.out.print(text[row][col] + " ");
            }
            System.out.println();
        }
    }
}
