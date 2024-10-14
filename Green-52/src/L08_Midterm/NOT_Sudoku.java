package L08_Midterm;

import java.util.Scanner;

public class NOT_Sudoku {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 9;
        int[][] sudoku = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }
        sudoku(sudoku, n);
        scanner.close();
    }

    private static void sudoku(int[][] sudoku, int n_) {
        boolean validSudoku = true;

        // Check all rows
        for (int i = 0; i < n_; i++) {
            int[] number = new int[10];
            for (int index = 0; index < 10; index++) {
                number[index] = 0;
            }
            for (int j = 0; j < n_; j++) {
                if (!isValidRow(sudoku[i][j], number)) {
                    validSudoku = false;
                }
            }
        }

        // Check all columns
        for (int i = 0; i < n_; i++) {
            int[] number = new int[10];
            for (int index = 0; index < 10; index++) {
                number[index] = 0;
            }
            for (int j = 0; j < n_; j++) {
                if (!isValidRow(sudoku[j][i], number)) {
                    validSudoku = false;
                }
            }
        }

        // Check all 3x3 cells
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] number = new int[10];
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (!isValidRow(sudoku[3 * i + m][3 * j + n], number)) {
                            validSudoku = false;
                        }
                    }
                }
            }
        }

        if (!validSudoku) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static boolean isValidRow(int value, int[] number) {
        if (number[value] == 0) {
            number[value] = 1;
            return true;
        } else {
            return false;
        }
    }
}
