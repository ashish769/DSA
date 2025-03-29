package Backtracking;

public class Sudoku {
    // Check if placing a number at board[row][col] is valid
    public boolean isSafe(char[][] board, int row, int col, int number) {
        char numChar = (char) (number + '0');

        // Check the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == numChar || board[i][col] == numChar) {
                return false;
            }
        }

        // Check the 3x3 grid
        int sr = (row / 3) * 3; // Starting row of the grid
        int sc = (col / 3) * 3; // Starting column of the grid

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == numChar) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursive function to solve the Sudoku
    public boolean helper(char[][] board, int row, int col) {
        // Base case: If we've processed all rows, Sudoku is solved
        if (row == 9) {
            return true;
        }

        // Move to the next cell
        int newRow, newCol;

        if (col == 8) { // If at the last column of the row
            newRow = row + 1; // Move to the next row
            newCol = 0; // Reset column to 0
        } else { // Otherwise, stay in the same row and move to the next column
            newRow = row;
            newCol = col + 1;
        }

        // Skip cells that already have numbers
        if (board[row][col] != '.') {
            return helper(board, newRow, newCol);
        }

        // Try placing digits 1 to 9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = (char) (num + '0'); // Place the number

                // Recur to solve the rest of the board
                if (helper(board, newRow, newCol)) {
                    return true;
                }

                // Backtrack if placing the number doesn't lead to a solution
                board[row][col] = '.';
            }
        }

        // Return false if no number can be placed
        return false;
    }

    // Main function to solve Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    // Print the Sudoku board
    public void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Sudoku solver = new Sudoku();

        // Define the Sudoku board ('.' represents an empty cell)
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        // show the initial suduku
        System.out.println("unSolved Sudoku:");
        solver.printBoard(board);

        // Solve the Sudoku
        solver.solveSudoku(board);

        // Print the solved board
        System.out.println("Solved Sudoku:");
        solver.printBoard(board);
    }
}
