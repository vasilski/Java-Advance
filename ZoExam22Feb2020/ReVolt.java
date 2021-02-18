package ZoExam22Feb2020;

import java.util.Arrays;
import java.util.Scanner;

public class ReVolt {

    public static int playerRow;
    public static int playerCol;
    public static int finishRow;
    public static int finishCol;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int commandCount = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            if (line.contains("f")) {
                playerRow = i;
                playerCol = line.indexOf("f");
            }
            if (line.contains("F")) {
                finishRow = i;
                finishCol = line.indexOf("F");
            }
            matrix[i] = line.toCharArray();
        }

        boolean hasWon = false;

        while (commandCount-- > 0 && !hasWon) {
            String command = scan.nextLine();

            switch (command) {
                case "up":
                    moveUp(matrix);
                    break;
                case "down":
                    moveDown(matrix);
                    break;
                case "left":
                    moveLeft(matrix);
                    break;
                case "right":
                    moveRight(matrix);
                    break;
            }
            hasWon = playerRow == finishRow && playerCol == finishCol;
        }

        if (hasWon) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }

    }

    private static void moveLeft(char[][] matrix) {
        int prevCol = playerCol;
        if (playerCol - 1 < 0) {
            playerCol = matrix.length;
        }
        if (matrix[playerRow][playerCol - 1] != 'T') {
            if (playerCol == matrix.length) {
                prevCol = 0;
            }
            matrix[playerRow][prevCol] = '-';
            playerCol--;
            if (matrix[playerRow][playerCol] == 'B') {
                int beforeRecursiveRow = playerRow, beforeRecursiveCol = playerCol;
                moveLeft(matrix);
                matrix[beforeRecursiveRow][beforeRecursiveCol] = 'B';
            }
            matrix[playerRow][playerCol] = 'f';
        }else {
            playerCol = prevCol;
        }

    }

    private static void moveUp(char[][] matrix) {
        int prevRow = playerRow;
        if (playerRow - 1 < 0) {
            playerRow = matrix.length;
        }
        if (matrix[playerRow - 1][playerCol] != 'T') {
            if (playerRow == matrix.length) {
                prevRow = 0;
            }
            matrix[prevRow][playerCol] = '-';
            playerRow--;
            if (matrix[playerRow][playerCol] == 'B') {
                int beforeRecursiveRow = playerRow, beforeRecursiveCol = playerCol;
                moveUp(matrix);
                matrix[beforeRecursiveRow][beforeRecursiveCol] = 'B';
            }
            matrix[playerRow][playerCol] = 'f';
        } else {
            playerRow = prevRow;
        }
    }

    private static void moveRight(char[][] matrix) {
        int prevCol = playerCol;
        if (playerCol + 1 == matrix.length) {
            playerCol = -1;
        }
        if (matrix[playerRow][playerCol + 1] != 'T') {
            if (playerCol == - 1) {
                prevCol = matrix.length - 1;
            }
            matrix[playerRow][prevCol] = '-';
            playerCol++;
            if (matrix[playerRow][playerCol] == 'B') {
                int beforeRecursiveRow = playerRow, beforeRecursiveCol = playerCol;
                moveRight(matrix);
                matrix[beforeRecursiveRow][beforeRecursiveCol] = 'B';
            }
            matrix[playerRow][playerCol] = 'f';
        } else {
            playerCol = prevCol;
        }
    }

    private static void moveDown(char[][] matrix) {
        int prevRow = playerRow;
        if (playerRow + 1 == matrix.length) {
            playerRow = -1;
        }
        if (matrix[playerRow + 1][playerCol] != 'T') {
            if (playerRow == -1) {
                prevRow = matrix.length - 1;
            }
            matrix[prevRow][playerCol] = '-';
            playerRow++;
            if (matrix[playerRow][playerCol] == 'B') {
                int beforeRecursiveRow = playerRow, beforeRecursiveCol = playerCol;
                moveDown(matrix);
                matrix[beforeRecursiveRow][beforeRecursiveCol] = 'B';
            }
            matrix[playerRow][playerCol] = 'f';
        } else {
            playerRow = prevRow;
        }
    }

}
